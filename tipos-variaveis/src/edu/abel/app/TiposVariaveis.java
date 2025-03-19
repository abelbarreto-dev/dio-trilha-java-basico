package edu.abel.app;

public class TiposVariaveis {
    public static void main(String[] args) {
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal;
        short numeroCurto2 = (short) numeroNormal;

        // variaveis vs. constantes

        final String BR = "Brasil";
        final double VALOR_DE_PI = 3.14;
    }
}