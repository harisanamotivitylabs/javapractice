package com.injections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration

public class Config {
    Map<Integer,String> contacts=new HashMap<>();
    public Map getContacts()
    {
        contacts.put(88596555,"harijio");
        contacts.put(88558254,"sairamlrp");
        contacts.put(88575285,"snadeeprvlp");
        contacts.put(88966555,"ramanadas");
        contacts.put(96585554,"lathabuddy");
        return contacts;
    }
    @Bean
    public Tower getTower(){
        return new Tower();
    }
@Bean(name = "airtel")
   Airtel getAirtelBean()
    {
        Airtel airtel= new Airtel();
        airtel.setCallername("hari");
        airtel.setMobileno(852852152);

        airtel.setContatcts(getContacts());
      return airtel;
    }
    @Bean(name = "idiea")
    Idiea getIdieaBean()
    {
        Idiea idiea= new Idiea();
         idiea.setCallername("bhaskar");
        idiea.setMobileno(965215852);

        return idiea;
    }


}
