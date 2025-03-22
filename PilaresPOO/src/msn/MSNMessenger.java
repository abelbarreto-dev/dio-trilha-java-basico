package msn;

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

    private void validarConectadoInternet() {
        System.out.println("verificando se conectado à internet".toUpperCase());
    }

    private void salvarHistoricoMessagem() {
        System.out.println("menssagem salva".toUpperCase());
    }
}
