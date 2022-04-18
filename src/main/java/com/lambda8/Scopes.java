package com.lambda8;

public class Scopes {

    private static double atributo1;
    private double atributo2;

    public double probarLocalVariable(){

        final double n3 = 3;
        IOeracion op = new IOeracion(){

            @Override
            public double calcularPromedio(double n1, double n2) {
                return n1 + n2 + n3;
            }
        };

        IOeracion operacion = (x,y) -> {
            return x + y +n3;
        };

        return operacion.calcularPromedio(1,1);
    }

    public double probarAtributosStaticVariables(){

        IOeracion op = new IOeracion() {

            @Override
            public double calcularPromedio(double n1, double n2) {
                atributo1 = n1 + n2;
                atributo2 = atributo1;
                return atributo2;
            }
        };

        IOeracion operacion = (x, y) -> {
            atributo1 = x + y;
            atributo2 = atributo1;
            return atributo2;
        };

        return op.calcularPromedio(3, 2);
    }

    public static void main(String... sara) {
        Scopes app = new Scopes();
        System.out.println(app.probarAtributosStaticVariables());
    }

}
