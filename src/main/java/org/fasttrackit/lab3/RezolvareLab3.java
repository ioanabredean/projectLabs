package org.fasttrackit.lab3;

import java.util.Scanner;

public class RezolvareLab3 {

    public static void main(String[] args) {

        // prima problema : media aritmetica a doua numere citite de la tastatura
        int a,b;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("introduceti primul numar pozitiv :");
            a = input.nextInt();
            if (a<0){
                System.out.println("numarul introdus nu este pozitiv; introduceti numarul din nou");
                }
            } while (a <0);
        do {
            System.out.println("introduceti al doilea numar pozitiv :");
            b = input.nextInt();
            if (b<0){
                System.out.println("numarul introdus nu este pozitiv; introduceti numarul din nou");
                }
            } while (b <0);

        doAverage( a, b);

        // problema 2 : media artimetica a N numere pozitive citite de la tastatura


        Scanner inputSir = new Scanner(System.in);
        System.out.println("cate numere vor fi incluse in urmatorul calcul al mediei aritmetice?");
        int lenght = inputSir.nextInt();
        int [] averageSir= new int [lenght];
        System.out.println("introduceti numerele pozitive pentru media aritmetica :");
        for (int i=0; i<lenght; i++){
            averageSir[i]=inputSir.nextInt();
            }
        avgSir(averageSir);

        //problema 13 - un numar e cuprins in intervalul 9-24? T/F

        Scanner numarRandom = new Scanner(System.in);
        System.out.println("introduceti un numar intreg");
        int x = numarRandom.nextInt();
        System.out.println("numarul introdus este in intervalul [9,24]?" +interval(x));



        //problema 14 - calcul a la puterea n

        Scanner ridicareLaPatrat = new Scanner(System.in);
        System.out.println("introduceti numarul a");
        a = ridicareLaPatrat.nextInt();
        System.out.println("introduceti numarun n");
        int n=ridicareLaPatrat.nextInt();
        ///System.out.println("rezultatul a la n este : "+ Math.pow(a,n)); varianta fara algoritm
        aLaPutereaN(a,n);
    }

    //problema 1

    public static int doAverage(int a,int b){
        int average = (a + b)/2;

        System.out.println("media artimetica a numerelor este "+ average);
        return average;
    }

    //problema 2

    public static int avgSir(int []sir) {
        int lungimeSir = sir.length;
        int suma = 0;
        for (int i= 0; i<lungimeSir; i ++) {
            suma = suma + sir[i];
            }
        int avg;
        avg = suma / lungimeSir;
        System.out.println( "media aritmetica a numerelor introduse este "+ avg);
       return avg;

    }

    //problema 13
    public static boolean interval(int x){
        if (x>8& x<25 ){
            return true;
         } else {
            return false;
        }
    }


    //problema 14

    public static int aLaPutereaN(int a,int n){
        int patrat, prod =0;
        patrat = a*a;
        if (n==1){
            prod = a;
        } else if(n==2){
            prod = patrat;
        }else{
            for (int i=3; i<=n; i++){
            prod = patrat*a;
            }}
        System.out.println("rezultatul a la puterea n este :"+prod);
        return prod;
    }
}
