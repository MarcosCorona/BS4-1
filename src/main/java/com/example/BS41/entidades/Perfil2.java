package com.example.BS41.entidades;


import com.example.BS41.interfaces.Perfiles;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil2")
public class Perfil2 implements Perfiles {
    public String perfil2 = "perfil2";


    @Override
    public void miFuncion() {
        System.out.println(perfil2);
    }
}
