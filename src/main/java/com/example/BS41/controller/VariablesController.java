package com.example.BS41.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@PropertySource("miconfiguration.properties")
public class VariablesController {
   @Value("${valor1}")
    String valor1;
    @Value("${valor2}")
    String valor2;

    @GetMapping("/valores")
    public String getVariables(){
        return   valor1 +  valor2;
    }



}