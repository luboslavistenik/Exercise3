package com.company;

public class Main {

    public static void main(String[] args) {
	    int a = 4;
	    int b = 3;
	    int c = 8;
	    int d = 0;
	    if(a + b > c && b + c > a && a + c > b)
            System.out.println(true);
	    else
            System.out.println(false);
    }
}
