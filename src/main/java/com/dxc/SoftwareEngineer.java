package com.dxc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer implements Engineer {

    public void development(){
        System.out.println("Write code");


    }
}
