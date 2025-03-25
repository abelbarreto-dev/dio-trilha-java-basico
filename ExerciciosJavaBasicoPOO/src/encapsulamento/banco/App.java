package encapsulamento.banco;

public class App {
    public static void main(String[] args) {
        final var banco = new Banco();

        banco.abrirContaBancaria(100);

        banco.depositarDinheiro(500);

        banco.depositarDinheiro(700);

        banco.pagarBoleto(1500);

        banco.consultarSaldo();
        banco.isContaUsandoChequeEspecial();
        banco.consultarSaldoChequeEspecial();

        banco.depositarDinheiro(300);

        banco.sacarDinheiro(500);
        banco.depositarDinheiro(501);
        banco.sacarDinheiro(500);

        banco.isContaUsandoChequeEspecial();
        banco.consultarSaldoChequeEspecial();
    }
}
