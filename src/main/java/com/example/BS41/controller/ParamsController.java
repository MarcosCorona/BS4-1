package com.example.BS41.controller;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamsController {
    @Value("${url}")
    String url;
    @Value("${password}")
    String password;

    @GetMapping("/parametros")
    public String getVariables(){
        return "URL:" + url + " password: " + password;
    }
}
