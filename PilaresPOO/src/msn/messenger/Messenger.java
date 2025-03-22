package msn.messenger;

public abstract class Messenger {
    public abstract void enviarMessagem();
    public abstract void receberMessagem();

    protected void validarConectadoInternet() {
        System.out.println("verificando se conectado à internet".toUpperCase());
    }

    protected void salvarHistoricoMessagem() {
        System.out.println("menssagem salva".toUpperCase());
    }
}
