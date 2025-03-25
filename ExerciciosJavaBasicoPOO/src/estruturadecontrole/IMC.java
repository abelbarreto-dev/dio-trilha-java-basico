package estruturadecontrole;

import java.util.Scanner;

public class IMC {
    public static String classificarImc(double imc) {
        String classificacao = null;
        if (imc <= 18.5)
            classificacao = "Abaixo do Peso";
        else if (imc <= 24.9)
            classificacao = "Peso Ideal";
        else if (imc <= 29.9)
            classificacao = "Levemente Acima do Peso";
        else if (imc <= 34.9)
            classificacao = "Obesidade Grau I";
        else if (imc <= 39.9)
            classificacao = "Obesidade Grau II (Severa)";
        else
            classificacao = "Obesidade Grau III (Mórbida)";

        return classificacao;
    }

    public static void main(String[] args) {
        System.out.println("Caluclar imc".toUpperCase());

        var scan = new Scanner(System.in);

        System.out.println("Peso (Kg)");
        double peso = scan.nextDouble();

        System.out.println("Altura (m)");
        double altura = scan.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        String imcClassificado = classificarImc(imc);

        System.out.println(
                "Seu IMC ".concat(Double.toString(imc))
                        .concat(" é classificado como: ")
                        .concat(imcClassificado).concat(".")
        );
    }
}
