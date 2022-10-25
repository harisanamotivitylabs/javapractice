package com.injections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("idiea")
public class Idiea implements Sim {
    private long mobileno;
    private String callername;
@Autowired
   private Tower tower;
    public void setTower(Tower tower) {

        this.tower = tower;
    }

    public long getMobileno() {
        return mobileno;
    }
    public void setMobileno(long mobileno) {
        this.mobileno = mobileno;
    }

    public String getCallername() {
        return callername;
    }

    public void setCallername(String callername) {
        this.callername = callername;
    }

    /* public Idiea(long mobileno,String callername) {
            this.callername=callername;
            this.mobileno = (int) mobileno;

        }*/
    @Override
    public void callig() {

        System.out.println("calling with Idiea sim");
    }

    @Override
    public void databrowse() {
        System.out.println("Data browsing with Idiea sim");

    }
}
