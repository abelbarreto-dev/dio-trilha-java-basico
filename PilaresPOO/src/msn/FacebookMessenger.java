package msn;

import msn.messenger.Messenger;

public class FacebookMessenger extends Messenger {
    public void enviarMessagem() {
        this.validarConectadoInternet();
        System.out.println("messagem enviada pelo facebook".toUpperCase());
        this.salvarHistoricoMessagem();
    }

    public void receberMessagem() {
        this.validarConectadoInternet();
        System.out.println("messagem recebida pelo facebook".toUpperCase());
        this.salvarHistoricoMessagem();
    }
}
