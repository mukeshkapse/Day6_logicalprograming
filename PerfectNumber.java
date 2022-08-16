package com.bridgelabz.Day6;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int i, num, sum = 0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your number");
        num=scan.nextInt();

        for(i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum == num)
        {
            System.out.println("The number is perfect number");

        }
        else
        {

            System.out.println("the number is not perfect number");
        }
    }
}
