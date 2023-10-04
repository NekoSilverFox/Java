/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2023/10/3 18:05
 * @Author : NekoSilverfox
 * @FileName: ClientController
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */
package com.bigdata.client;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/gateway")
public class ClientController {
    @Autowired
    RestTemplate restTemplate;

    @Value("${endpoint.server}")
    private String msEndpoint;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getGateway() {
        System.out.println("Only get gateway");
        return "Get from gateway";
    }

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public String getData() {
        System.out.println("Returning data from gateway");
        return "Hello from gateway";
    }

    @RequestMapping(value = "/server-data", method = RequestMethod.GET)
    public String getServerData() {
        System.out.println("Returning data from server through gateway");
        try {
            System.out.println("Endpoint name : [" + msEndpoint + "]");
            return restTemplate.getForObject(new URI(msEndpoint), String.class);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "Exception occurred";
    }
}
