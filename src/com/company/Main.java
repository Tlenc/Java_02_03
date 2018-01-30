package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Įveskite du skaičius");
        Scanner sc = new Scanner(System.in);
        float psk = sc.nextFloat();
        float ask = sc.nextFloat();
        float skirtumas = psk - ask;
        float suma = psk + ask;
        System.out.println("Skirtumas :" + skirtumas);
        System.out.println("Suma : " + suma);
    }
}
