public class Main {
    public static void main(String[] args) {
        MusicPlayer musicBox = new MusicBox("Os Guerreiros se Preparam", true);

        musicBox.playMusic();
        musicBox.pauseMusic();
        musicBox.stopMusic();

        var smartphone = new SmartPhone();

        smartphone.playMusic();
        smartphone.pauseMusic();
        smartphone.stopMusic();

        smartphone.playVideo();
        smartphone.pauseVideo();
        smartphone.stopVideo();
    }
}
