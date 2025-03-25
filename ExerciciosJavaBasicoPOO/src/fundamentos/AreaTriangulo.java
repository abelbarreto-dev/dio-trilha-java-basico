package fundamentos;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Base do Triangulo? (m)");
        double base = scanner.nextDouble();

        System.out.println("Altura do Triangulo? (m)");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A área do Triangulo é de ".
                concat(Double.toString(area)).
                concat(" m²."));
    }
}
