package org.example;


public class CalcCientfica extends Calculator{
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }


    public static void main (String args[]) {
        Calculator cal = new Calculator();
        cal.sum(4,5);
        cal.add(6,8);

    }
}