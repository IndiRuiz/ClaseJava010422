package com.company;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner inputData = new Scanner(System.in);
        System.out.println("Ingresar cantidad de estudiantes: ");
        int size = inputData.nextInt();
        int[] notas = new int[size];
        int suma =0;
        double promedio;

        //Cargar vector
        for (int i=0; i<notas.length; i++){
                System.out.println("Ingresar notas: ");
                notas[i] = inputData.nextInt();
        }


        //Mostrar de elementos del vector
        for (int i=0; i<notas.length; i++){
            System.out.println("La nota del estudiante " + (i+1)+ " es:" + notas[i]);
        }

        //Promedio
        for (int i=0; i<notas.length; i++){
            suma = suma + notas[i];
        }
        promedio = suma / size;
        System.out.println("El promedio es " + promedio);



    }
}
