package com.bridgelabz.Day6;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num ;
        int reversed = 0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your number");
        num=scan.nextInt();
        for(;num != 0;num/=10)
        {
            int value=num%10;
            reversed=reversed*10+value;
        }
        System.out.println("reversed number is:"+reversed);
    }

}
