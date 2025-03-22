package corrida;

public class Autodromo {
    public static void main(String[] args) {
        Carro penske = new Carro();
        penske.setChassi("12121596");
        penske.ligar();

        System.out.println("-------\nMOTO");

        Moto xlr = new Moto();
        xlr.setChassi("959641416");
        xlr.ligar();

        Veiculo ferrari = penske;

        ferrari.ligar();
        System.out.println(ferrari.getChassi());
    }
}
