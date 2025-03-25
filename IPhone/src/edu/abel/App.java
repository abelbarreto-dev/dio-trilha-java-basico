package edu.abel;

import edu.abel.model.IPhone;

public class App {
    public static void main(String[] args) {
        var iphone = new IPhone();

        iphone.setNome("abel");

        iphone.acessarSite("github.com");
        iphone.abrirNovaAba();
        iphone.fecharAba();
        iphone.fecharNavegador();

        iphone.discarLigacao();
        iphone.fazerLigacao();
        iphone.desligarLigacao();

        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.pararMusica();

        System.out.println(iphone.getNome());
    }
}
