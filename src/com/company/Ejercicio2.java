package com.company;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner inputData = new Scanner(System.in);
        System.out.println("Ingresar cantidad de estudiantes: ");
        int size = Integer.parseInt(inputData.nextLine());
        int[] notaEstudiante = new int[size];
        String[] nombre = new String[size];
        double sumaGral =0;
        double sumaEstudiante =0 ;
        double promedio;
        double promedioEstudiante =0;


        //Cargar vector
        for (int i=0; i<notaEstudiante.length; i++){
            System.out.println("Nombre del estudiante");
            nombre[i] = inputData.nextLine();
            for (int j=0; j<3; j++){
                System.out.println("Ingresar notas del estudiante: " + (i+1));
                notaEstudiante[i] = inputData.nextInt();
            }

        }


        //Mostrar de elementos del vector
        for (int i=0; i<notaEstudiante.length; i++){
            System.out.println("La nota de " + nombre[i] + " es:" + notaEstudiante[i]);
        }

        //Promedio
        for (int i=0; i<notaEstudiante.length; i++){
            sumaEstudiante = sumaEstudiante + notaEstudiante[i];
            sumaGral = sumaGral + notaEstudiante[i];


        }
        promedioEstudiante = sumaEstudiante /3;
        promedio = sumaGral/ size;
        System.out.println("El promedio es " + promedio);



    }
}
