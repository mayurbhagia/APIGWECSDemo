package com.aws.proserve.apigwdemo.APIGWECSDemo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.net.InetAddress;
@RestController

public class TestController {

    @RequestMapping("/")
    public String home() {
        String str = "<html><head><body style=\"background-color: #E6E6FA\";><h1 style=\"color:blue;\">Welcome to the demo of AWS API Gateway along with ECS and EKS!</h1></body></head></html>";
        return str;
    }

    @RequestMapping("/ipaddress")
    public String ipaddress() {
        InetAddress inetAddress= null;
        String ipaddr = null;
        try {
            inetAddress = InetAddress.getLocalHost();
            System.out.println("IP Address:- " + inetAddress.getHostAddress());
            System.out.println("Host Name:- " + inetAddress.getHostName());
ipaddr = "<html><head><body style=\"background-color: #E6E6FA\";><h1 style=\"color:blue;\">IP Address is=" + inetAddress.getHostAddress() + " &&& Hostname is=" + inetAddress.getHostName()+"</h1></body></head></html>";

        }
        catch (Exception e) {
            System.out.println("Error===" + e);
        }

        return ipaddr;
    }
}