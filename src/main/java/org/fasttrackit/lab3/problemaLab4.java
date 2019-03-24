package org.fasttrackit.lab3;

import java.util.Scanner;

public class problemaLab4 {

    public static void main(String[]args){
        computeMedie();
       float aritmetica = computeMedie();
        System.out.println( "media aritmetica este " + aritmetica);
    }

    private static float computeMedie() {
        Scanner treiNumere = new Scanner(System.in);
        System.out.println("introduceti cele 3 numere: ");

        int suma =0;
        for (int i=0; i<3; i++) {
            suma +=treiNumere.nextInt();
        }
        float aritmetica = (float)suma/3;

        return aritmetica;
    }
}
