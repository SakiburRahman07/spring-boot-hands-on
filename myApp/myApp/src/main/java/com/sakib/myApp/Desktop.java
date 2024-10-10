package com.sakib.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile(){

        System.out.println("You got 404 component but faster");
    }
}
