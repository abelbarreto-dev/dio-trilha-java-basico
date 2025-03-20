import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("Digite Seu Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite Seu Sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("Digite Sua Idade: ");
            int idade = scanner.nextInt();

            System.out.println("Nome: ".concat(nome));
            System.out.println("SobreNome: ".concat(sobrenome));
            System.out.println("Idade: " + idade);
        } catch (InputMismatchException ip) {
            System.out.println("Ocorreu um erro! ");
        } finally {
            scanner.close();
        }
    }
}
