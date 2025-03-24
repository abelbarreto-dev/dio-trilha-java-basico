package estruturadecontrole;

import java.util.Scanner;

public class Tabuada {
    private static void tabuadaAdicao(int valor) {
        System.out.println("tabuada adição".toUpperCase());
        for (int i = 1; i < 11; i ++) {
            System.out.println(
                    "".concat(Integer.toString(valor))
                            .concat(" + ")
                            .concat(Integer.toString(i))
                            .concat(" = ")
                            .concat(Integer.toString(valor + i))
            );
        }
    }

    private static void tabuadaSubtracao(int valor) {
        System.out.println("tabuada subtração".toUpperCase());
        for (int i = 1; i < 11; i ++) {
            System.out.println(
                    "".concat(Integer.toString(valor))
                            .concat(" - ")
                            .concat(Integer.toString(i))
                            .concat(" = ")
                            .concat(Integer.toString(valor - i))
            );
        }
    }

    private static void tabuadaMultiplicao(int valor) {
        System.out.println("tabuada multiplicação".toUpperCase());
        for (int i = 1; i < 11; i ++) {
            System.out.println(
                    "".concat(Integer.toString(valor))
                            .concat(" x ")
                            .concat(Integer.toString(i))
                            .concat(" = ")
                            .concat(Integer.toString(valor * i))
            );
        }
    }

    private static void tabuadaDivisao(int valor) {
        System.out.println("tabuada divisão".toUpperCase());
        for (int i = 1; i < 11; i ++) {
            System.out.println(
                    "".concat(Integer.toString(valor))
                            .concat(" : ")
                            .concat(Integer.toString(i))
                            .concat(" = ")
                            .concat(Integer.toString(valor / i))
            );
        }
    }

    private static void fazerTabuada(int valor) {
        tabuadaAdicao(valor);
        tabuadaSubtracao(valor);
        tabuadaMultiplicao(valor);
        tabuadaDivisao(valor);
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Tabuada");
        System.out.println("Digite um número de base?");
        int valorBase = scanner.nextInt();

        fazerTabuada(valorBase);
    }
}
