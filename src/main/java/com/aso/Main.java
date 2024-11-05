package com.aso;

public class Main {
    public static void main(String[] args) {
        
        //array
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        //A) ciclo for 
        System.out.println("valores +1 del arreglo: ");
        for (int i : array) {
            System.out.println(i+1);
        }

        //B) Imprimir la suma de los valores del array
        System.out.println("Resultado de la suma del arreglo: "+sumArray(array));

        //C) Imprimir el numero con mayor valor
        System.out.println("El numero con el mayor valor es: "+maxValor(array));
        
        //D) El numero promedio
        System.out.println("El valor promedio es: "+promValor(array));

        //E) Imprimir el ultimo metodo
        metodoFinal(sumArray(array), maxValor(array), promValor(array), "Francisco Torres");
    }

    //B) Metodo suma todos los valores del arreglo
    public static int sumArray(int[] array){
        int resultado = 0;
        for (int i : array) {
            resultado += i;
        }
        return resultado;
    }

    //c) Metodo numero maximo
    public static int maxValor(int[] array){
        int max = 0;
        for (int i : array) {
            if(i>max){
                max = i;
            }
        }
        return max;
    }

    //d) Metodo numero promedio
    public static double promValor(int[] array){
        double prom = (sumArray(array)) / 2;
        return prom;
    }
    
    //e) metodo final
    public static void metodoFinal(int suma, int maximo, double promedio, String nombre){
        //primera operacion
        int resultadoA = suma - maximo;
        //segunda operacion
        double resultadoB = suma * maximo * promedio;

        //imprimir
        System.out.println("Resultado de la resta: "+resultadoA);
        System.out.println("Resultado de la multiplicacion: "+resultadoB);

        //condicional del nombre
        if(nombre == "Francisco Torres"){
            System.out.println("Verdadero!!!");
        }else{
            System.out.println("Falso!!!");
        }
    }
}