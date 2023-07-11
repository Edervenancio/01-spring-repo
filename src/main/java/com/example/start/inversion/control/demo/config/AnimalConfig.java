package com.example.start.inversion.control.demo.config;

import com.example.start.inversion.control.demo.common.Animal;
import com.example.start.inversion.control.util.Duck;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfig {


    @Bean
    public Animal duck(){
        return new Duck();
    }
}
