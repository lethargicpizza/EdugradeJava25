public class Song {
    private String title, artist;
    private int durationInSeconds;

    public Song(String title, String artist, int durationInSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public String getTitle() {
                return title;
    }

    public String getArtist() {
        return artist;
    }
}
