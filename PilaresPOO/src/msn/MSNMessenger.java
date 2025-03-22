package msn;

import msn.messenger.Messenger;

public class MSNMessenger extends Messenger {
    public void enviarMessagem() {
        this.validarConectadoInternet();
        System.out.println("messagem enviada pelo msn".toUpperCase());
        this.salvarHistoricoMessagem();
    }

    public void receberMessagem() {
        this.validarConectadoInternet();
        System.out.println("messagem recebida pelo msn".toUpperCase());
        this.salvarHistoricoMessagem();
    }
}
