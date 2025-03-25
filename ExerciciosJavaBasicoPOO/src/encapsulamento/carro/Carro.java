package encapsulamento.carro;

public class Carro {
    private boolean ligado;
    private int marcha;
    private int velocidade;

    public Carro() {
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public void ligarCarro() {
        System.out.println("ligar carro".toUpperCase());
        if (this.isLigado()) {
            System.out.println("Carro já está ligado.");
            return;
        }

        this.setLigado(true);
        System.out.println("Carro ligado.");
    }

    public void desligarCarro() {
        System.out.println("desligar carro".toUpperCase());
        if (!this.isLigado()) {
            System.out.println("Carro já está desligado.");
            return;
        }

        if (this.getMarcha() == 0 && this.getVelocidade() == 0) {
            this.setLigado(false);
            System.out.println("Carro desligado.");
        }
        else
            System.out.println("Desacelere e coloque no Ponto Morto!");
    }

    public void acelerarCarro() {
        System.out.println("acelerar carro".toUpperCase());

        if (!this.isLigado()) {
            System.out.println("Primeiro ligue o carro!");
            return;
        }

        switch (this.getMarcha()) {
            case 0:
                System.out.println("Ponto morto, não acelera!");
                return;
            case 1:
                if (this.getVelocidade() < 21)
                    this.setVelocidade(this.getVelocidade() + 1);
                break;
            case 2:
                if (this.getVelocidade() < 41)
                    this.setVelocidade(this.getVelocidade() + 1);
                break;
            case 3:
                if (this.getVelocidade() < 61)
                    this.setVelocidade(this.getVelocidade() + 1);
                break;
            case 4:
                if (this.getVelocidade() < 81)
                    this.setVelocidade(this.getVelocidade() + 1);
                break;
            case 5:
                if (this.getVelocidade() < 101)
                    this.setVelocidade(this.getVelocidade() + 1);
                break;
            case 6:
                if (this.getVelocidade() < 121)
                    this.setVelocidade(this.getVelocidade() + 1);
                break;
        }

        System.out.println("Velocidade: " + this.getVelocidade() + " KMH.");
    }

    public void desacelerarCarro() {
        System.out.println("desacelerar carro".toUpperCase());

        if (!this.isLigado()) {
            System.out.println("Primeiro ligue o carro!");
            return;
        }

        if (this.getVelocidade() > 0)
            this.setVelocidade(this.getVelocidade() - 1);
        System.out.println("Velocidade: " + this.getVelocidade() + " KMH.");
    }

    public void trocarMarcha() {
        System.out.println("trocando a marcha".toUpperCase());

        if (!this.isLigado()) {
            System.out.println("Primeiro ligue o carro!");
            return;
        }

        this.setMarcha(
                this.getMarcha() < 6 ?
                this.getMarcha() + 1 :
                0
        );

        System.out.println("Marcha trocada para: " + this.getMarcha());
    }

    public boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getMarcha() {
        return marcha;
    }

    private void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getVelocidade() {
        return velocidade;
    }

    private void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
