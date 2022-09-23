package com.collection;

import java.util.Scanner;

public class Main {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter integer number");
        int num =sc.nextInt();
        int r1,sum1=0,t1=num;
        int r2,sum2=0,t2=num;
        int countmax=0;
        int countmin=0;
        int a=0,b=0;int temp1=0,temp2=0;
        System.out.println(t1);

while(t1!=0)
{
        temp1=t1;
        while(temp1>0){
            r1=temp1%10;  //getting remainder
            sum1=(sum1*10)+r1;
            temp1=temp1/10;
        }
      
        countmax++;
       
        if(sum1==t1)
        { t1=0;
        	a=t1;
            break;
        }
        t1=t1+1;
    }
System.out.println(a);
}
}
