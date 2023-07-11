package com.example.start.inversion.control.demo.rest;


import com.example.start.inversion.control.demo.common.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Animal myAnimal;


    @Autowired
    public DemoController(@Qualifier("duck") Animal theAnimal){
        myAnimal = theAnimal;
    }

    @GetMapping("/sound")
    public String sound(){
        return myAnimal.sound();
    }

    @GetMapping("/movement")
    public String moviment(){
        return myAnimal.movement();
    }

    @GetMapping("/name")
    public String name(){
        return myAnimal.name();
    }
}
