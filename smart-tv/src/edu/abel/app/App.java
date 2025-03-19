package edu.abel.app;

import edu.abel.model.SmartTv;

public class App {
    public static void main(String[] args) {
        SmartTv smart = new SmartTv();

        System.out.println(smart);

        smart.ligar();

        System.out.println(smart);

        smart.aumentarVolume();
        smart.aumentarVolume();

        System.out.println(smart);

        smart.diminuirVolume();

        System.out.println(smart);

        smart.aumentarCanal();
        smart.aumentarCanal();
        smart.aumentarCanal();

        System.out.println(smart);

        smart.diminuirCanal();
        System.out.println(smart);

        smart.saltarCanal(15);
        System.out.println(smart);

        smart.saltarCanal(0);
        System.out.println(smart);

        smart.desligar();
        smart.aumentarCanal();
        smart.aumentarVolume();

        System.out.println(smart);

        smart.ligar();
        System.out.println(smart);
    }
}
