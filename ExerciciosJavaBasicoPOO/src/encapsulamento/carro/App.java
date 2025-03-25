package encapsulamento.carro;

public class App {
    public static void main(String[] args) {
        var carro = new Carro();

        carro.ligarCarro();

        carro.trocarMarcha();

        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();

        carro.desacelerarCarro();

        carro.trocarMarcha();
        carro.trocarMarcha();

        carro.desacelerarCarro();

        carro.desligarCarro();

        carro.desacelerarCarro();
        carro.desacelerarCarro();
        carro.desacelerarCarro();

        carro.trocarMarcha();
        carro.trocarMarcha();
        carro.trocarMarcha();
        carro.trocarMarcha();

        carro.desligarCarro();
    }
}
