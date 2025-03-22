package msn;

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

    private void validarConectadoInternet() {
        System.out.println("verificando se conectado à internet".toUpperCase());
    }

    private void salvarHistoricoMessagem() {
        System.out.println("menssagem salva".toUpperCase());
    }
}
