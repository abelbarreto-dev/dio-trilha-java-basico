package app;

import enums.EstadoBrasileiro;

public class App {
    public static void main(String[] args) {
        for (EstadoBrasileiro est : EstadoBrasileiro.values()) {
            System.out.println(est.getSigla().concat(" - ").concat(est.getNome()));
        }

        EstadoBrasileiro eb = EstadoBrasileiro.BAHIA;

        System.out.println(eb.getSigla().concat(" | ").concat(eb.getNome()));
        System.out.println(eb.getNomeUpcase());
    }
}
