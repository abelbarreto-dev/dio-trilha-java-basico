package encapsulamento.branco;

import java.util.Scanner;

public class Banco {
    private Conta conta;

    public void abrirContaBancaria(double depositoInicial) {
        System.out.println("abrir conta bancária".toUpperCase());
        if (depositoInicial < 10) {
            System.out.println("Deposito Inicial deve ser de no mínimo R$ 10.00");
            return;
        }

        double chequeEspecial = depositoInicial <= 500.0 ? 50.0 : depositoInicial * 0.5;

        this.conta = new Conta();

        this.conta.setSaldo(depositoInicial);
        this.conta.setChequeEspecial(chequeEspecial);
        this.conta.setUsandoCheckEspecial(false);
        this.conta.setTaxaChequeEspecial(0.2);

        System.out.println("Conta Bancária criada!");
    }

    public void depositarDinheiro(double deposito) {
        System.out.println("depositar dinheiro".toUpperCase());
        if (this.isContaFechada()) {
            System.out.println("Primeiro abra sua conta");
            return;
        }

        if (deposito < 0) {
            System.out.println("Informe valor positivo");
            return;
        }

        System.out.println("Valor a Depositar: R$ "
                .concat(Double.toString(deposito)));

        this.conta.setSaldo(
                this.conta.getSaldo() + deposito
        );

        if (this.conta.isUsandoCheckEspecial()) {
            double valorTaxado = this.conta.getChequeEspecial() * this.conta.getTaxaChequeEspecial();

            this.conta.setSaldo(
                    this.conta.getSaldo() - valorTaxado
            );

            System.out.println("* Taxa de -20% sobre o Cheque Especial...");
            System.out.println("* Valor inscide no saldo.");
            this.conta.setUsandoCheckEspecial(false);
        }

        System.out.println("Depósito OK!");
        System.out.println("Novo Saldo: R$ ".concat(Double.toString(this.conta.getSaldo())));
        if (deposito > 500.0) {
            this.conta.setChequeEspecial(
                    deposito * 0.5
            );
            System.out.println("Valor do Cheque Especial Atualizado Para: R$ "
                    .concat(Double.toString(this.conta.getChequeEspecial())));
        } else {
            this.conta.setChequeEspecial(50.0);
            System.out.println("Valor do Cheque Especial Atualizado Para: R$ "
                    .concat(Double.toString(this.conta.getChequeEspecial())));
        }
    }

    public void sacarDinheiro(double saque) {
        System.out.println("sacar dinheiro".toUpperCase());
        if (this.isContaFechada()) {
            System.out.println("Primeiro abra sua conta");
            return;
        }

        saque = saque < 0 ? saque : -saque;

        if (-saque > this.conta.getSaldo()) {
            System.out.println("Saldo insuficiente para saque!");
            return;
        }

        this.conta.setSaldo(
                this.conta.getSaldo() + saque
        );

        System.out.println("Saque OK!");
        System.out.println("Novo Saldo: R$ ".concat(Double.toString(this.conta.getSaldo())));
    }

    public void pagarBoleto(double boletoValor) {
        System.out.println("pagar boleto".toUpperCase());
        if (this.isContaFechada()) {
            System.out.println("Primeiro abra sua conta");
            return;
        }

        boletoValor = boletoValor < 0 ? boletoValor : -boletoValor;

        if (-boletoValor > this.conta.getSaldo()) {
            System.out.println("Saldo Insuficiente para Pagar Boleto!");

            double saldoECheque = this.conta.getSaldo() + this.conta.getChequeEspecial();

            if (saldoECheque < boletoValor)
                return;

            System.out.print("Usar cheque especial? (s\n...) ");
            String usarCheque = new Scanner(System.in).nextLine().toUpperCase();

            usarCheque = usarCheque.substring(0, 1);

            if (usarCheque.equals("S")) {
                System.out.println("Usando Cheque Especial!");
                this.conta.setUsandoCheckEspecial(true);

                this.conta.setSaldo(0);
                this.conta.setChequeEspecial(saldoECheque + boletoValor);
            }

            return;
        }

        this.conta.setSaldo(
                this.conta.getSaldo() - boletoValor
        );

        System.out.println("Pagamento do Boleto OK!");
        System.out.println("Novo Saldo: R$ ".concat(Double.toString(this.conta.getSaldo())));
    }

    public void isContaUsandoChequeEspecial() {
        System.out.println("consulta: cheque especial".toUpperCase());
        String message = this.conta.isUsandoCheckEspecial() ? "Essa Conta Está Usando Cheque Especial!" :
                "Essa Conta Não Está Usando Cheque Especial!";

        System.out.println(message);
    }

    public void consultarSaldo() {
        System.out.println("consultar saldo".toUpperCase());

        if (this.isContaFechada()) {
            System.out.println("Primeiro abra sua conta");
            return;
        }

        System.out.println("R$ ".concat(Double.toString(this.conta.getSaldo())));
    }

    public void consultarSaldoChequeEspecial() {
        System.out.println("consultar saldo cheque especial".toUpperCase());

        if (this.isContaFechada()) {
            System.out.println("Primeiro abra sua conta");
            return;
        }

        System.out.println("R$ ".concat(Double.toString(this.conta.getChequeEspecial())));
    }

    private boolean isContaFechada() {
        return this.conta == null;
    }
}
