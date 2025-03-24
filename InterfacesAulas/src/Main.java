public class Main {
    public static void main(String[] args) {
        var musicPlayer = new MusicPlayer() {
            /*Isso é uma classe anonima*/
            @Override
            public void playMusic() {
                System.out.println("tocando a música");
            }

            @Override
            public void pauseMusic() {
                System.out.println("pausando a música");
            }

            @Override
            public void stopMusic() {
                System.out.println("parando a música");
            }
        };
        musicPlayer.playMusic();
        musicPlayer.pauseMusic();
        musicPlayer.stopMusic();
    }
}
