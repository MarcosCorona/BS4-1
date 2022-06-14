package com.example.BS41.entidades;

import com.example.BS41.interfaces.Perfiles;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil1")
public class Perfil1 implements Perfiles {
    public String perfil1 = "perfil1";


    @Override
    public void miFuncion() {
        System.out.println(perfil1);
    }
}