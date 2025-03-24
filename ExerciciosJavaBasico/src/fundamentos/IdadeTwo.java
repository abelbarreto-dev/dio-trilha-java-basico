package fundamentos;

import java.time.LocalDate;
import java.util.Scanner;

public class IdadeTwo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("PESSOA 1");
        System.out.print("Digite seu Nome: ");
        String nome1 = scanner.nextLine();

        System.out.print("Digite o ano que você nasceu: ");
        int ano1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("PESSOA 2");
        System.out.print("Digite seu Nome: ");
        String nome2 = scanner.nextLine();

        System.out.print("Digite o ano que você nasceu: ");
        int ano2 = scanner.nextInt();

        int currentYear = LocalDate.now().getYear();

        int idade1 = currentYear - ano1;
        int idade2 = currentYear - ano2;

        int diferenca = idade1 - idade2;

        diferenca = diferenca >= 0 ? diferenca : diferenca * (-1);

        System.out.println(
                "A difereça de idade entre ".concat(nome1)
                        .concat(" e ")
                        .concat(nome2)
                        .concat(" é de: ")
                        .concat(Integer.toString(diferenca)).concat(" anos.")
        );
    }
}
