import java.util.concurrent.ThreadLocalRandom;

public class LoopWhile {
    public static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

    public static void main(String[] args) {
        double mesada = 50;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;

            mesada -= valorDoce;
        }

        System.out.println("Mesada R$ " + mesada);
        System.out.println("Joãozin gosta de gastar, tu é louco?!");
    }
}
