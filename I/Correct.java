interface AudioMediaPlayer {
    public void playAudio();
}

interface VideoMediaPlayer {
    public void playVideo();
}


public class DivMediaPlayer implements AudioMediaPlayer, VideoMediaPlayer {

    @Override
    public void playAudio() {
        //implementacao correta, pois VLC executa audio
    }

    @Override
    public void playVideo() {
        //implementacao correta, pois VLC executa video
    }

}

class VlcMediaPlayer implements AudioMediaPlayer, VideoMediaPlayer {

    @Override
    public void playAudio() {
        //implementacao correta, pois VLC executa audio
    }

    @Override
    public void playVideo() {
        //implementacao correta, pois VLC executa video
    }

}

class WinampMediaPlayer implements AudioMediaPlayer {

    @Override
    public void playAudio() {
        //implementacao correta, pois winamp executa audio
    }

}