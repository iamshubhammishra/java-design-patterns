package adapter;

public class AudioPlayer implements MediaPlayer{
    private MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        mediaAdapter = new MediaAdapter();
        mediaAdapter.play(audioType, fileName);
    }
}
