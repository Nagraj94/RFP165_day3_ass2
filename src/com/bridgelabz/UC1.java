package com.bridgelabz;

public class UC1 {
    public static void main(String[] args) {
        int x=50;
        int x1=10;
        int x2=20;
        int x3=30;
        int y=20;
        int y1=30;
        int y2=40;
        int y3=20;

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
    }
}
