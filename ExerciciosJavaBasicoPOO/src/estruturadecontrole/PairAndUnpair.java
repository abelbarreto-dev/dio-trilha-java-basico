package estruturadecontrole;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PairAndUnpair {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        System.out.println("Primeiro Número?");
        int numero1 = scan.nextInt();

        System.out.println("Segundo Número? (deve ser maior que o primeiro)");
        int numero2 = scan.nextInt();
        scan.nextLine();

        List<Integer> pairs = new ArrayList<Integer>();
        List<Integer> unpairs = new ArrayList<Integer>();

        for (int i = numero2; i >= numero1; i --) {
            if (i % 2 == 0)
                pairs.add(i);
            else
                unpairs.add(i);
        }

        System.out.println("Escolha entre:");
        System.out.println("1. Pair");
        System.out.println("2. Unpair");
        System.out.println("Escolha?");
        int opt = scan.nextInt();

        switch (opt) {
            case 1:
                System.out.println("Números Pares".toUpperCase());
                pairs.forEach(System.out::println);
                break;
            case 2:
                System.out.println("Números Ímpares".toUpperCase());
                unpairs.forEach(System.out::println);
                break;
            default:
                System.out.println("Inválido.");
        }

    }
}
