package com.mycompany.negativooupositivo;

import java.util.Scanner;

public class NegativoOuPositivo {

    public static void main(String[] args) {

        int x;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Negativo ou Positivo?");

        x = teclado.nextInt();

        if (x < 0) {
            System.out.println("Ele é negativo, mano.");
        } 
        else {
              System.out.println("Ele é positivo, mano.");
        }
    }    
}
    
