package com.dxc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Company {
    @Autowired
         //   @Qualifier("hardwareEngineer")
    Engineer engineer;
   // @Value("${company.Name}")
     @Value("DXC")
    String companyName;

   // public Company(SoftwareEngineer engineer) {
    //    this.engineer = engineer;
     //   System.out.println("constructor");
  //  }
  // public void setEngineer(SoftwareEngineer engineer) {
  //      this.engineer = engineer;
   //    System.out.println("setter");

  //  }

    public void showHistory(){
        System.out.println("Company History...........");
        System.out.println("Name of the Company:" +companyName);
    }
}
