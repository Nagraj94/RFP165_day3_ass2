package com.bridgelabz;

import java.util.Objects;
import java.util.Scanner;

public class UC1 {
    public static void main(String[] args) {
        System.out.println("enter x and y values");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x value");
        int x=sc.nextInt();
        System.out.println("enter x1 value");
        int x1=sc.nextInt();
        System.out.println("enter x2 value");
        int x2=sc.nextInt();
        System.out.println("enter x3 value");
        int x3=sc.nextInt();
        System.out.println("enter y value");
        int y=sc.nextInt();
        System.out.println("enter y1 value");
        int y1=sc.nextInt();
        System.out.println("enter y2 value");
        int y2=sc.nextInt();
        System.out.println("enter y3 value");
        int y3=sc.nextInt();

        int lengthOfLine1 = (int) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("length of line 1 is: " + lengthOfLine1);
        int lengthOfLine2 = (int) Math.sqrt((x3-x)*(x3-x) + (y3-y)*(y3-y));
        System.out.println("length of line 2 is: " + lengthOfLine2);
       if(lengthOfLine1>lengthOfLine2)
       {
           System.out.println("line 1 is greater than line 2");
       }
       else
       {
           System.out.println("line 2 is greater than line 1");
       }
        System.out.println("*********************************");
       if(Objects.equals(lengthOfLine1,lengthOfLine2))
       {
           System.out.println("length of both line is equal");
       }
       else
       {
           System.out.println("length of both line is not equal");
       }
    }
}
