package fundamentos;

import java.time.LocalDate;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o ano que você nasceu: ");
        int ano = scanner.nextInt();

        int currentYear = LocalDate.now().getYear();

        int idade = currentYear - ano;

        System.out.println(
                "".concat(nome).
                        concat(", você tem ").
                        concat(Integer.toString(idade)).
                        concat(" anos")
        );
    }
}
