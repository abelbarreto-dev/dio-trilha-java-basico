package encapsulamento.branco;

public class Conta {
    private double saldo;
    private double chequeEspecial;
    private boolean usandoCheckEspecial;
    private double taxaChequeEspecial;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public boolean isUsandoCheckEspecial() {
        return usandoCheckEspecial;
    }

    public void setUsandoCheckEspecial(boolean usandoCheckEspecial) {
        this.usandoCheckEspecial = usandoCheckEspecial;
    }

    public double getTaxaChequeEspecial() {
        return taxaChequeEspecial;
    }

    public void setTaxaChequeEspecial(double taxaChequeEspecial) {
        this.taxaChequeEspecial = taxaChequeEspecial;
    }
}
