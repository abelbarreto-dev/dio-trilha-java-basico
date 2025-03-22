package msn;

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

    private void validarConectadoInternet() {
        System.out.println("verificando se conectado à internet".toUpperCase());
    }

    private void salvarHistoricoMessagem() {
        System.out.println("menssagem salva".toUpperCase());
    }
}
