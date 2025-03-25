package edu.abel.model;

import edu.abel.interfaces.Internet;
import edu.abel.interfaces.Telefone;
import edu.abel.interfaces.TocaMusica;

public class IPhone implements Telefone, TocaMusica, Internet {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void acessarSite(String site) {
        System.out.println("acessando site ".concat(site).concat(" na internet!"));
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("abrindo nova aba no navegador de internet!");
    }

    @Override
    public void fecharAba() {
        System.out.println("fechando aba aberta no navegador de internet!");
    }

    @Override
    public void fecharNavegador() {
        System.out.println("fechando navegador de internet!");
    }

    @Override
    public void discarLigacao() {
        System.out.println("discando ligação telefônica!");
    }

    @Override
    public void fazerLigacao() {
        System.out.println("fazendo ligação telefônica!");
    }

    @Override
    public void desligarLigacao() {
        System.out.println("ligação telefônica desligada!");
    }

    @Override
    public void tocarMusica() {
        System.out.println("musica está tocando!");
    }

    @Override
    public void pausarMusica() {
        System.out.println("musica pausada!");
    }

    @Override
    public void pararMusica() {
        System.out.println("musica parou de tocar!");
    }
}
