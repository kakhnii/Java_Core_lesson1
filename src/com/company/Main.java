package com.company;

import java.util.Arrays;
import java.util.OptionalInt;

public class Main {

    public static void main(String[] args) {
        byte a=2;
        short b= 1;
        int c= 5;
        long d =124;
        float  i = 2.2f;
        double j = 5.5d;
        char k = 100;
        boolean l= true,y=false ;

        System.out.println("Byte MIN = "+Byte.MIN_VALUE+"-----" + " MAX = "+Byte.MAX_VALUE);
        System.out.println("Short MIN = "+Short.MIN_VALUE+ "-----" + " MAX = "+Short.MAX_VALUE);
        System.out.println("Integer MIN = "+Integer.MIN_VALUE +"-----" + " MAX = "+Integer.MAX_VALUE);
        System.out.println("Long MIN = "+Long.MIN_VALUE +"-----" + " MAX = "+Long.MAX_VALUE);
        System.out.println("Float MIN = "+Float.MIN_VALUE +"-----" +" MAX = "+Float.MAX_VALUE);
        System.out.println("Double MIN = "+Double.MIN_VALUE +"-----" + " MAX = "+Double.MAX_VALUE);
        System.out.println("Character MIN = " + Character.MIN_VALUE+"-----" + " MAX = " +Character.MAX_VALUE );
        System.out.println("Boolean = " + l + " OR " + y);

        System.out.println("===================================================================================");


        int array1 [] = {1,2,3,4,5,6,7,8,9,0};
        OptionalInt max = Arrays.stream(array1).max();
        System.out.println("Найбільше число масиву = " + max.getAsInt());
        OptionalInt min = Arrays.stream(array1).min();
        System.out.println("Найменше число масиву = " + min.getAsInt());

    }

}