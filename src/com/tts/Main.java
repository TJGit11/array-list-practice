package com.tts;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter 5 numbers");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        ArrayList<Integer> intArray;
        intArray = new ArrayList<>(5);

// Tried using array instead of array list
//        int[] intArray = new int[]{num1, num2, num3, num4, num5,};

        intArray.add(num1);
        intArray.add(num2);
        intArray.add(num3);
        intArray.add(num4);
        intArray.add(num5);


//        System.out.println(intArray);

        System.out.println("These are your numbers: " + intArray);

        int sum = 0;
        for (int value : intArray) {
            sum += value;
        }
        int prod = 1;
        for (int value: intArray) {
            prod *= value;
        }

        /*
          Attempting to loop through every number in the array,
        compare it to the max, and then reassign the max if (n) is greater
                int max = intArray.get(0);
                for (int i = 1 ; i < intArray.size(); i++);{
                    if ( > max);
                    {
                        max = intArray.get(0);
                    }
                }
        */

        System.out.println("Let's add them all together: " + sum);
        System.out.println("Multiply them all: " + prod);
        System.out.println("This one is the largest number: " + Collections.max(intArray) );
        System.out.println("And this one is the smallest number: " + Collections.min(intArray) );


//  Tried using a basic array instead of an arraylist
//        int num = [num1, num2, num3, num4, num5]
//        System.out.println();

    }
}
