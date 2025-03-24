package fundamentos;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Qual o lado (m) do quadrado?");
        double lado = scanner.nextDouble();

        double area = Math.pow(lado, 2);

        System.out.println("A area do quadrado é: ".concat(Double.toString(area)).
                concat(" m²."));
    }
}
