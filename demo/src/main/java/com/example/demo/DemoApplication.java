package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Resource
    RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String callHone() {
//         restTemplate.getForObject("http://localhost:8989/miya", String.class);
        String result =  restTemplate.getForObject("http://bibackend.7000mall.test/auth/code", String.class);

        System.out.println(result);

        return result;

    }


}
