import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Cadastro Conta Bancária");

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite a agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println(
            "Olá ".concat(nomeCliente) + ", " +
            "obrigado por criar uma conta em nosso banco" +
            ", sua agência é ".concat(agencia) +
            ", conta " + numero +
            ", e seu saldo R$ " + saldo +
            " já está disponível para saque!"
        );
    }
}
