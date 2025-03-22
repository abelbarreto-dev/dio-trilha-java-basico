package msn;

public class App {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();

        msn.enviarMessagem();
        msn.receberMessagem();
        msn.enviarMessagem();
        msn.receberMessagem();
    }
}
