package com.injections;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mobile {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
        System.out.println("configuere file readed");
      Airtel sim = applicationContext.getBean("airtel",Airtel.class);
       sim .callig();
       sim.databrowse();
       sim.usingSignals();
       sim.showContacts();

    }

}
