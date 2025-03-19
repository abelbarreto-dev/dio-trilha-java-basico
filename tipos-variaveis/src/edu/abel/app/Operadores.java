package edu.abel.app;

public class Operadores {
    public static void main(String[] args) {
        int numero = 5;

        numero = -numero;

        System.out.println(- numero);
        System.out.println(numero);

        numero = -numero;
        System.out.println(numero);

        numero++;
        System.out.println(numero);

        numero--;
        System.out.println(numero);

        numero += 2;
        System.out.println(numero);

        System.out.println("regrinha incremento e decremento e bool");
        System.out.println(numero --);
        System.out.println(numero);

        System.out.println(++ numero);
        System.out.println(numero);

        boolean euEVoce = true;
        System.out.println(!euEVoce);
        System.out.println(euEVoce);

        euEVoce = !euEVoce;
        System.out.println(euEVoce);
    }
}
