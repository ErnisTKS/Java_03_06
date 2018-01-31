package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main objektas = new Main();
    }

    public Main(){
        Scanner sc = new Scanner(System.in);
        String[] mas= new String[5];
        for (int i=0; i<mas.length; i++){
            System.out.println("Iveskite zodi: ");
            mas[i]=sc.nextLine();
        }
        for (int i=0; i<mas.length; i++){
            System.out.println("Masyvo " + i + " zodis yra "+mas[i]);
        }
    }
}
