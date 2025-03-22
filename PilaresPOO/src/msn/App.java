package msn;

public class App {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();

        msn.enviarMessagem();
        msn.receberMessagem();
        msn.enviarMessagem();
        msn.receberMessagem();

        FacebookMessenger facebook = new FacebookMessenger();

        facebook.enviarMessagem();
        facebook.receberMessagem();
        facebook.enviarMessagem();
        facebook.receberMessagem();

        TelegramMenssenger telegram = new TelegramMenssenger();

        telegram.enviarMessagem();
        telegram.receberMessagem();
        telegram.enviarMessagem();
        telegram.receberMessagem();
    }
}
