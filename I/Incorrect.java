interface MediaPlayer {
    public void playAudio();
    public void playVideo();
}

class VlcMediaPlayer implements MediaPlayer {
    @Override
    public void playAudio() {
        //implementacao correta, pois VLC executa audio
    }

    @Override
    public void playVideo() {
        //implementacao correta, pois VLC executa video
    }
}

class WinampMediaPlayer implements MediaPlayer {

    //implementacao incorreta, pois winamp nao suporta execucao de video
    @Override
    public void playVideo() {
        throw new VideoUnsupportedException();
    }

    @Override
    public void playAudio() {
        //implementacao correta, pois Winamp executa audio
    }
}