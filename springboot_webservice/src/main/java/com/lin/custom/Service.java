package com.lin.custom;

import javax.xml.ws.Endpoint;

/**
 * @author: Mr.Lin
 * @create: 2019-08-13 21:22:10
 **/
public class Service {

    public static void main(String[] args) {
        String address1="http://127.0.0.1:8888/ws/phoneManager";
        Endpoint.publish(address1, new PhoneServiceImpl());
        System.out.println("wsdl地址 :"+address1+"?WSDL");
    }
}
