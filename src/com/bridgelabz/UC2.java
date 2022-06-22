package com.bridgelabz;

public class UC2 {
    public static void main(String[] args) {
        int x=50;
        int x1=10;
        int x2=20;
        int x3=30;
        int y=20;
        int y1=30;
        int y2=40;
        int y3=20;

        double line1 = Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
        System.out.println("length of line 1: " + line1);

        double line2 =  Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
        System.out.println("length of line 2: " + line2);

        int compare = Integer.compare((int) line1, (int) line2);
        System.out.println("length of line " + compare + " greater than line" );
    }
}
