package adapter;

public class MediaAdapter implements MediaPlayer {
    private LegacyPlayer legacyPlayer = new LegacyPlayer();

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            legacyPlayer.playMp4(fileName);  // call the old method
        } else {
            System.out.println("Unsupported format: " + audioType);
        }
    }
}
