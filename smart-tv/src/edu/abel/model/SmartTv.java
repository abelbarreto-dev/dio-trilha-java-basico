package edu.abel.model;

public class SmartTv {
    private boolean ligado;
    private int canal;
    private int volume;

    public SmartTv() {
        this.ligado = false;
        this.canal = 0;
        this.volume = 0;
    }

    public SmartTv(boolean ligado, int canal, int volume) {
        this.ligado = ligado;
        this.canal = canal;
        this.volume = volume;
    }

    public String toString() {
        return (
        "Ligado? " + this.isLigado() + "\n" +
        "Volume: " + this.getVolume() + "\n" +
        "Canal: " + this.getCanal() + "\n"
        );
    }

    public void aumentarVolume() {
        if (this.isLigado())
            this.volume ++;
    }

    public void diminuirVolume() {
        if (this.isLigado())
            this.volume --;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void aumentarCanal() {
        if (this.isLigado())
            this.canal ++;
    }

    public void diminuirCanal() {
        if (this.isLigado())
            this.canal --;
    }

    public void saltarCanal(int canal) {
        if (this.isLigado())
            this.canal = canal > 0 ? canal : 1;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public int getCanal() {
        return this.isLigado() ? this.canal : -1;
    }

    public int getVolume() {
        return this.isLigado() ? this.volume : -1;
    }
}
