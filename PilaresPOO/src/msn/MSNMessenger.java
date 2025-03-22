package msn;

public class MSNMessenger {
    public void enviarMessagem() {
        this.validarConectadoInternet();
        System.out.println("messagem enviada".toUpperCase());
        this.salvarHistoricoMessagem();
    }

    public void receberMessagem() {
        this.validarConectadoInternet();
        System.out.println("messagem recebida".toUpperCase());
        this.salvarHistoricoMessagem();
    }

    private void validarConectadoInternet() {
        System.out.println("verificando se conectado à internet".toUpperCase());
    }

    private void salvarHistoricoMessagem() {
        System.out.println("menssagem salva".toUpperCase());
    }
}
