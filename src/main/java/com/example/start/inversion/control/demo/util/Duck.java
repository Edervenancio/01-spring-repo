package com.example.start.inversion.control.demo.util;

import com.example.start.inversion.control.demo.common.Animal;
import org.springframework.stereotype.Component;


@Component
public class Duck implements Animal {


    @Override
    public String sound(){
        return "Quack";
    }

    public String movement(){
        return "Fly";
    }

    public String name(){
        return "Duck";
    }

}


