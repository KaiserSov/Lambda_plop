package com.lambda8;

import java.util.*;

public class LambdaApp {

    public void ordenar (){
        List<String> lista = new ArrayList<>();
        lista.add("Sara está probando lambdas");
        lista.add("Esperemos que funcione");
        lista.add("Brillas");

        /*Collections.sort(lista, new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                //Compara un valor con otro y los organiza de forma ascendente
                return o1.compareTo(o2);
            }
        });*/

        //Esto es Lambda
        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

        for (String elemento : lista){
            System.out.println(elemento);
        }

    }

    public void calcular(){
        /*IOeracion operacion = new IOeracion() {
            @Override
            public double calcularPromedio(double n1, double n2) {
                return (n1 + n2) / 2;
            }
        };

        System.out.println(operacion.calcularPromedio(2,3));*/

        //Lambda
        IOeracion operacion = (double x, double y) -> (x+y)/2;
        operacion.calcularPromedio(2,3);
        System.out.println(operacion.calcularPromedio(2,3));


    }

    public static void main(String[] args) {
        LambdaApp app = new LambdaApp();
        System.out.println(" ");
        System.out.println("La lista ordenada es:");
        app.ordenar();
        System.out.println(" ");
        System.out.println("El promedio es:");
        app.calcular();

    }
}
