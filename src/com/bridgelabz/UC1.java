package com.bridgelabz;

public class UC1 {
    public static void main(String[] args) {
        int x1=10;
        int x2=20;
        int y1=30;
        int y2=40;

        int lengthOfLine = (int) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println(lengthOfLine);
    }
}
