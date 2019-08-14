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
@SOAPBinding(style= SOAPBinding.Style.RPC)
@WebService(targetNamespace = "http://custom.lin.com")
public interface PhoneService {

    @WebResult(name="phone")
    public  Phone getPhoneInfo(@WebParam(name="osName")String osName);
}
