package org.example;

public class Main {
    public static void main(String[] args) {

        int[] enteros;

        enteros = new int[5];

        int[] enteros2 = new int[2];


        int[] enteros3 = {1, 2, 3, 4, 5}; //[I@65ab7765

//        for(int i = 0; i < enteros3.length; i++){
//            System.out.print(enteros3[i]);
//        }

        int suma = 0;
        for(int entero: enteros3){
           suma += entero;
        }

        int promedio = suma/enteros3.length;
        System.out.println(promedio);
    }
}