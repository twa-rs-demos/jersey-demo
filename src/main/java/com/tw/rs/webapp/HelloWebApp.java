package com.tw.rs.webapp;

/**
 * Created by zhyingjia on 16-10-14.
 */

import com.tw.rs.service.HelloWorldService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloWebApp {
    private static HelloWorldService helloWorldService = new HelloWorldService();

    @GET()
    public String hello() {
        return helloWorldService.sayHello();
    }
}