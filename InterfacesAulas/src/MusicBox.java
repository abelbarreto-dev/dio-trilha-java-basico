public record MusicBox(String music, boolean isPaused) implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("caixa de musica tocando a musica " + music());
    }

    @Override
    public void pauseMusic() {
        System.out.println("caixa de musica pausando a musica " + music());
    }

    @Override
    public void stopMusic() {
        System.out.println("caixa de musica parando a musica " + music());
    }
}
