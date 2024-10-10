package com.sakib.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired //field Injection
    @Qualifier("desktop")
    private Computer computer;

//    //constructor injection
//    public Alien(Laptop laptop)
//    {
//        this.laptop=laptop;
//    }
//    @Autowired
//    public void setLaptop(Laptop laptop)
//    {
//        this.laptop=laptop;
//    }
    public void build()
    {
        computer.compile();

        System.out.println("working on awesome project");
    }
}
