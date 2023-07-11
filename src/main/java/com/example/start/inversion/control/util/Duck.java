package com.example.start.inversion.control.util;

import com.example.start.inversion.control.demo.common.Animal;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Lazy
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


