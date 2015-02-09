package com.muskan.TestWork;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by muskan on 2/9/15.
 */


public class RandomNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int randomNumber1=randomNumbergeneretor();
        int randomNumber2=randomNumbergeneretor();

        System.out.println("The random number generated are:");
        System.out.println("Number1="+randomNumber1);
        System.out.println("Number2="+randomNumber2);
        System.out.print("Enter the result of Number1*Number2=");
        int answer=input.nextInt();
        int actualAnswer=randomNumber1*randomNumber2;

        if(answer==actualAnswer)
        {
            System.out.println("Congratulation.");
        }
        else
        {
            System.out.println("You have to study harder.");
        }
    }
    static int randomNumbergeneretor()
    {
        int randomNumber=0;
        Random rand= new Random();
        randomNumber= rand.nextInt(9);
        return randomNumber;

    }
}
