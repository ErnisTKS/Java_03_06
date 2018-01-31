package com.company;
import java.util.Scanner;

public class Main {
    static String[] mas= new String[5];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Masyvas();
        Rasymas();
    }

    public static void Masyvas(){

        for (int i=0; i<mas.length; i++){
            System.out.println("Iveskite zodi: ");
            mas[i]=sc.nextLine();
        }
    }

    public static void Rasymas(){
        for (int i=0; i<mas.length; i++){
            System.out.println("Masyvo " + i + " zodis yra "+mas[i]);
        }
    }
}
