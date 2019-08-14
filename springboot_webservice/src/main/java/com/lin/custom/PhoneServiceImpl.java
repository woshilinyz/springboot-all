package com.lin.custom;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

/**
 * @author: Mr.Lin
 * @create: 2019-08-13 20:58:01
 **/
@WebService(
        targetNamespace = "http://custom.lin.com",
        endpointInterface="com.lin.custom.PhoneService"
)
@SOAPBinding(style= SOAPBinding.Style.RPC)
public class PhoneServiceImpl implements PhoneService{

    @Override
    public  Phone getPhoneInfo(String osName){
        Phone phone=new Phone();
        if(osName.endsWith("android")){
            phone.setName("android");phone.setOwner("google");phone.setTotal(80);
        }else if(osName.endsWith("ios")){
            phone.setName("ios");phone.setOwner("apple");phone.setTotal(15);
        }else{
            phone.setName("windows phone");phone.setOwner("microsoft");phone.setTotal(5);
        }
        return phone;
    }


}
