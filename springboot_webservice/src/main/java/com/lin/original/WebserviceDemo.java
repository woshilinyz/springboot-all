package com.lin.original;



import cn.com.webxml.GetDatabaseInfo;
import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Mr.Lin
 * @create: 2019-08-13 19:09:11
 **/
public class WebserviceDemo {
    //http://www.webxml.com.cn/zh_cn/web_services.aspx

    public void get(String mobileCode ,String userID)throws  Exception{
        URL url=new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx/getMobileCodeInfo?mobileCode="+mobileCode+
                "&userID="+userID);
        HttpURLConnection conn=(HttpURLConnection) url.openConnection();
        conn.setConnectTimeout(5000);
        conn.setRequestMethod("GET");
        if(conn.getResponseCode()==HttpURLConnection.HTTP_OK){
            InputStream is=conn.getInputStream();
            ByteArrayOutputStream boas=new ByteArrayOutputStream();
            byte[] buffer=new byte[1024];
            int len=-1;
            while((len=is.read(buffer))!=-1){
                boas.write(buffer, 0, len);
            }
            System.out.println("GET请求获取的数据:"+boas.toString());
            boas.close();
            is.close();
        }
    }

    public void post(String mobileCode ,String userID) throws Exception{

        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        formparams.add(new BasicNameValuePair("mobileCode", mobileCode));
        formparams.add(new BasicNameValuePair("userID", userID));
        HttpEntity reqEntity = new UrlEncodedFormEntity(formparams, "utf-8");

        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(5000)//一、连接超时：connectionTimeout-->指的是连接一个url的连接等待时间
                .setSocketTimeout(5000)// 二、读取数据超时：SocketTimeout-->指的是连接上一个url，获取response的返回等待时间
                .setConnectionRequestTimeout(5000)
                .build();

        HttpClient client =  HttpClientBuilder.create().build();
        HttpPost post = new HttpPost("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx/getMobileCodeInfo");
        post.setEntity(reqEntity);
        post.setConfig(requestConfig);
        HttpResponse response = client.execute(post);

        if (response.getStatusLine().getStatusCode() == 200) {
            HttpEntity resEntity = response.getEntity();
            String message = EntityUtils.toString(resEntity, "utf-8");
            System.out.println(message);
        } else {
            System.out.println("请求失败");
        }
    }

    public void soap() throws Exception{
        HttpEntity entity=new InputStreamEntity(WebserviceDemo.class.getClassLoader().getResourceAsStream("soap.xml"));
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(5000)//一、连接超时：connectionTimeout-->指的是连接一个url的连接等待时间
                .setSocketTimeout(5000)// 二、读取数据超时：SocketTimeout-->指的是连接上一个url，获取response的返回等待时间
                .setConnectionRequestTimeout(5000)
                .build();

        HttpClient client =  HttpClientBuilder.create().build();
        HttpPost post = new HttpPost("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx");
        post.setHeader("Content-Type","text/xml; charset=utf-8");
        post.setEntity(entity);
        post.setConfig(requestConfig);
        HttpResponse response = client.execute(post);

        if (response.getStatusLine().getStatusCode() == 200) {
            HttpEntity resEntity = response.getEntity();
            String message = EntityUtils.toString(resEntity, "utf-8");
            System.out.println(message);
        } else {
            System.out.println("请求失败");
        }
    }


    public void test(){
        //wsimport http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl
        //jar -cvf  打包  在引入类路径
        MobileCodeWS w=new MobileCodeWS();
        MobileCodeWSSoap mobileCodeWSSoap = w.getMobileCodeWSSoap();
        String mobileCodeInfo = mobileCodeWSSoap.getMobileCodeInfo("13413641696", "");
        System.out.println(mobileCodeInfo);
    }




    public static void main(String[] args) throws Exception {
        WebserviceDemo webservice=new WebserviceDemo();
        //webservice.get("13413641696","");
        //webservice.post("13413641696","");
       // webservice.soap();
        webservice.test();
    }
}
