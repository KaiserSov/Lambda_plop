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

        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

        for (String elemento : lista){
            System.out.println(elemento);
        }

    }

    public static void main(String[] args) {
        LambdaApp app = new LambdaApp();
        app.ordenar();

    }
}
