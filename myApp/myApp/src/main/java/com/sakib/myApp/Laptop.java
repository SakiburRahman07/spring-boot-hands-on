package com.sakib.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
//@Primary - eita print hobe

public class Laptop implements Computer {
    public void compile(){

        System.out.println("You got 404 component");
    }
}
