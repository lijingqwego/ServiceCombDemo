package com.zdw.helloworld.controller;


import com.zdw.helloworld.api.HelloWorldInterfaces;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create By zdw on 2019/6/24
 */
@RequestMapping("/")
@RestSchema(schemaId = "providerController")
public class ProviderController implements HelloWorldInterfaces {

    @GetMapping("hello")
    @Override
    public String sayHello(String name) {
        System.out.println("名称是："+name);
        return "请求成功，返回名称："+name;
    }
}
