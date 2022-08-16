package com.bridgelabz.Day6;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num;
        boolean val=false;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your number");
        num=scan.nextInt();

        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                val=true;

            }
        }

        if(!val) {
            System.out.println("number is  prime");
        }
        else
        {
            System.out.println("number is not prime");
        }
    }
}
