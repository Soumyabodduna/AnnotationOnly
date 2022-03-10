package com.dxc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;


@Configuration//no need of xml file
@ComponentScan(basePackages = "com.dxc")//it scans the classes in the package
//@PropertySources("classpath:company-info")
public class ConfigClass {


  //  @Bean
  //  public SoftwareEngineer engineer()
 //   {

 //       return new SoftwareEngineer();
//    }
//    @Bean
//    public Company company()
 //   {
       // Company company =new Company(engineer());// constructor
       // Company company =new Company();
      //  company.setEngineer(engineer());
       // return  company;
 ///      Company company =new Company();// setter
  ///        company.setEngineer(engineer());
  ///         return  company;
  //  }
}
