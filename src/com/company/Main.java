package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your co
        System.out.println("ENTER THREE NUMBERS :" );
        int num1,num2,num3;
        Scanner object = new Scanner(System.in);
        num1 = object.nextInt();
        num2 = object.nextInt();
        num3 = object.nextInt();

        if(num1>num2 && num2>num3){
            System.out.println(" THE GREATEST NUMBER IS : " + num1);
        }else if (num2>num1 && num1 > num3){
            System.out.println("THE GREATEST NUMBER IS : " +num2);
        }else{
            System.out.println("THE GREATEST NUMBER IS : "+num3);
        }


    }
}
