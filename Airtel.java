package com.injections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Iterator;
import java.util.Map;

@Component("airtel")
public class Airtel implements Sim {
    private long mobileno;
    private String callername;

    private Tower tower;
    private Map<Integer,String > contatcts;
public Airtel(){}
    public void setContatcts(Map contatcts)//setter injection of collection autowireing
    {

        this.contatcts = contatcts;
    }
@Autowired
    public void setTower(Tower tower) {
        this.tower = tower;
    }//constructor by object injection autowireing

    public Airtel(Tower tower) {
        this.tower = tower;
        System.out.println("by constructor called");
    }
    void usingSignals()
    {
        tower.shereingSignels();
    }

    public void setMobileno(long mobileno) {
        this.mobileno = mobileno;
    }//literal setter injection


    public void setCallername(String callername) {
        this.callername = callername;
    }//literal setter injection
    public void showContacts()
    {
        Iterator<Map.Entry< Integer,String>> contact=contatcts.entrySet().iterator();
        System.out.println("Contact numbers");
        while (contact.hasNext())
        {
            Map.Entry<Integer,String> s1 =contact.next();
            System.out.println(s1.getValue()+"  "+s1.getKey());
        }
    }
    @Override
    public void callig() {
        System.out.println(callername+" Calling using Airtel sim no "+mobileno);
    }

    @Override
    public void databrowse() {

        System.out.println(callername+"$$$Data browsing using Airtel sim ");
    }
}
