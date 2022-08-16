package com.bridgelabz.Day6;

public class FaboniciSeries {
    public static void main(String[] args) {

        int f1=0,f2=1,f3=0,count=5 ;

        for(int i=2;i<=count;i++)
        {

            f3=f1+f2;
            System.out.println(" "+f3);
            f1=f2;
            f2=f3;
        }
    }
}
