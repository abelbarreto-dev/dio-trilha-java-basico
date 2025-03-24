package estruturadecontrole;

import java.util.Scanner;

public class RestNoZero {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        System.out.println("Digite o Primeiro Número?");
        int primeiroNumero = scan.nextInt();

        if (primeiroNumero == 0) {
            System.out.println("Erro: Não é Possível Divisão Por Zero!");
            return;
        }

        while (true) {
            System.out.print("Mais um número: ");
            int numero = scan.nextInt();

            if (numero < primeiroNumero)
                continue;

            if (numero % primeiroNumero != 0)
                break;
        }
    }
}
