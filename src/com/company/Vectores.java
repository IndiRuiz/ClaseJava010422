package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

public class Vectores {

    public static void main(String[] args) {
        //int[] numbers = {10, 12, 15, 21, 30}. Valor constante.
        //int[] numbers = new int[5];
        Scanner inputData = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de posiciones: ");
        int size = inputData.nextInt();
        int[] numbers = new int[size];
        for(int i=0; i<numbers.length; i++){
            System.out.println("Ingresar dato: " + (i+1));
            numbers[i] = inputData.nextInt();
        }

        for (int i=0; i<numbers.length; i++){
            System.out.println("En la posición " + i + " está el número " + numbers[i]);
        }

    }
}
