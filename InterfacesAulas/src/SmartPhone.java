public class SmartPhone implements VideoPlayer, MusicPlayer{
    @Override
    public void playVideo() {
        System.out.println("smartphone tocando o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("smartphone pausando o video");
    }

    @Override
    public void stopVideo() {
        System.out.println("smartphone parando o video");
    }

    @Override
    public void playMusic() {
        System.out.println("smartphone tocando a musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("smartphone pausando a musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("smartphone parando a musica");
    }
}
