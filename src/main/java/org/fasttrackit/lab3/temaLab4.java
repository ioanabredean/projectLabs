package org.fasttrackit.lab3;

import java.util.Scanner;

public class temaLab4 {

   public static void main(String []args){

        //problema 6, pc a

        Scanner digit = new Scanner(System.in);
        System.out.println("please enter a number with more than one digit");
        int num ;
        num = digit.nextInt();
        int sum = 0; int counter=0;
        while(num>0){
            sum = sum + num%10;
            num=num/10;
            counter++;
        }
        System.out.println("the sum of the digits in the given number is "+sum);

       //pc b
        num=64321;
        int prod =1;
        while(num >0){
            prod=prod*num%10;
            num=num/10;
            }
        System.out.println("the product of the digits in the given number is "+prod);

        //pc c
        System.out.println("the number of digits in the given number is "+counter);

        //problema 10

       int[] array = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
       System.out.println("enter the number you are searching for");
       Scanner input = new Scanner(System.in);
       int number;
       number = input.nextInt();
       for (int i = 0; i < array.length; i++) {
           if (array[i] == number) {
               System.out.println("the number entered is part of the array defined, at index number "+i);
           } else {
               System.out.println(-1);
           }
       }

       //Problema 11


           Scanner number2 = new Scanner(System.in);
           System.out.println("Tell me a number and I will sum all the first natural numbers up to the defined number");
           int n = number2.nextInt();
           int suma=0;
           for (int i=0;i<n; i++){
               suma=suma+i;
           }
           System.out.println("the sum of first given natural numbers is "+sum);
       }
    }



    // problema 6
    /*private static int digits;
    {  Scanner digit = new Scanner(System.in);
        System.out.println("please enter a number with more digits");
        int num ;
        num = digit.nextInt();


    }


    //problema 10
    private static int findNinArray;    {

        int[] array = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
        System.out.println("enter the number you are searching for");
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("the number entered is part of the array defined, at index number "+i);
            } else {
                System.out.println(-1);
            }
        }
    }

    //Problema 11

    private static int sumaN;{
        Scanner number = new Scanner(System.in);
        System.out.println("Tell me a number and I will sum all the first natural numbers up to the defined number");
        int n = number.nextInt();
        int sum=0;
        for (int i=0;i<n; i++){
            sum=sum+i;
            }
        System.out.println("the sum of first given natural numbers is "+sum);
            }
    }

*/
