package edu.abel.app;

public class Operadores {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 5;

        String result = (a == b) ? "verdadeiro" : "falso";

        System.out.println(result);

        String nome1 = "Abel";
        String nome2 = new String("Abel");

        System.out.println(nome1);
        System.out.println(nome2);
        System.out.println(nome1.equals(nome2));
    }
}
