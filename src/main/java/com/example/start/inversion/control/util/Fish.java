package com.example.start.inversion.control.util;

import com.example.start.inversion.control.demo.common.Animal;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
@Lazy
public class Fish implements Animal {


    @Override
    public String sound(){
        return "Booop";
    }

    @Override
    public String movement(){
        return "swims";
    }

    @Override
    public String name(){
        return "Fish";
    }

}
