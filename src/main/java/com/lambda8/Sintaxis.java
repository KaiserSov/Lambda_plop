package com.lambda8;

public class Sintaxis {

    public double probarSintaxis() {
        IOeracion operacion = (double x, double y) -> (x + y) / 2;
        //IOeracion operacion = (double x, double y) -> {return (x + y) / 2;};
        /*IOeracion operacion = (double x, double y) -> {
            double a = 2.0;
            System.out.println(a);
            return (x + y) / 2 + a;
        };*/

        //IOeracion operacion = (x, y) -> (x + y) /2 ;
        /*IOeracion operacion = () -> {
            int x = 2;
            int y = 3;
            return x+y;
        };*/
        return operacion.calcularPromedio(2,3);
    }

    public static void main(String[] args) {
        Sintaxis app = new Sintaxis();

        System.out.println(app.probarSintaxis());
    }
}
