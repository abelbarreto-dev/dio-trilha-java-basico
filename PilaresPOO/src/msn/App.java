package msn;

import msn.messenger.Messenger;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Escolha o Aplicativo: ");
        System.out.println("[1] MSN");
        System.out.println("[2] TELEGRAM");
        System.out.println("[3] FACEBOOK");
        System.out.println("Sua Escolha?");

        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        Messenger msg;

        switch (option) {
            case 1:
                msg = new MSNMessenger();
                msg.enviarMessagem();
                msg.receberMessagem();
                break;
            case 2:
                msg = new TelegramMenssenger();
                msg.enviarMessagem();
                msg.receberMessagem();
                break;
            case 3:
                msg = new FacebookMessenger();
                msg.enviarMessagem();
                msg.receberMessagem();
                break;
            default: System.out.println("Opção Inválida");
        }
    }
}
