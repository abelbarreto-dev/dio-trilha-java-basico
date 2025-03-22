package corrida;

public class Carro extends Veiculo {
    @Override
    public void ligar() {
        this.conferirCambio();
        this.conferirCombustivel();
        System.out.println("Carro Ligado!".toUpperCase());
    }

    private void conferirCambio() {
        System.out.println("conferindo cambio em P!".toUpperCase());
    }

    private void conferirCombustivel() {
        System.out.println("Conferindo Combustível...".toUpperCase());
    }
}
