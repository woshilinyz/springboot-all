package com.lin.cxf.service;

import com.lin.cxf.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(//对外发布的服务名
        targetNamespace="http://service.cxf.lin.com"//指定你想要的名称空间，通常使用使用包名反转
        )
public interface UserService {

    @WebMethod//标注该方法为webservice暴露的方法,用于向外公布，它修饰的方法是webservice方法，去掉也没影响的，类似一个注释信息。
    public User getUser(@WebParam(name = "userId") String userId);

    @WebMethod//(exclude=true)该犯法不暴露，静态方法和final方法不暴露
    @WebResult(name="String",targetNamespace="")
    public String getUserName(@WebParam(name = "userId") String userId);

}
