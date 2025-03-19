package edu.abel.app;

public class Operadores {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        System.out.println(condicao1 || condicao2); // OU
        System.out.println(condicao1 && condicao2); // AND
        System.out.println(condicao1 ^ condicao2); // XOR
        System.out.println(!condicao1 ^ condicao2);
    }
}
