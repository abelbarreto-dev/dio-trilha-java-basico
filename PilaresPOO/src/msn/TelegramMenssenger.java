package msn;

import msn.messenger.Messenger;

public class TelegramMenssenger extends Messenger {
    public void enviarMessagem() {
        this.validarConectadoInternet();
        System.out.println("messagem enviada pelo telegram".toUpperCase());
        this.salvarHistoricoMessagem();
    }

    public void receberMessagem() {
        this.validarConectadoInternet();
        System.out.println("messagem recebida pelo telegram".toUpperCase());
        this.salvarHistoricoMessagem();
    }
}
