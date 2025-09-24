import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Playlist {
    private List<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public int getTotalSeconds() {
        int totalSeconds = 0;
        for (Song song : songs) {
            totalSeconds += song.getDurationInSeconds();
        }

        return totalSeconds;
    }

    public Playlist sort(Playlist playlist) {
        for (int i = 0; i < playlist.songs.size(); i++) {
            for (int j = i + 1; j < playlist.songs.size(); j++) {
                Song song_i = playlist.songs.get(i);
                Song song_j = playlist.songs.get(j);

                if (song_i.getDurationInSeconds() > song_j.getDurationInSeconds()) {
                    playlist.songs.set(i, song_j);
                    playlist.songs.set(j, song_i);
                }
            }
        }
        return playlist;
    }

    public Playlist sort() {
        for (int i = 0; i < this.songs.size(); i++) {
            for (int j = i + 1; j < this.songs.size(); j++) {
                Song song_i = this.songs.get(i);
                Song song_j = this.songs.get(j);

                if (song_i.getDurationInSeconds() > song_j.getDurationInSeconds()) {
                    this.songs.set(i, song_j);
                    this.songs.set(j, song_i);
                }
            }
        }

        return this;
    }

    public void printPlaylist() {
        for (Song song : songs) {
            System.out.println("Title: "  + song.getTitle()+", Artist: " + song.getArtist() + ", Duration: " + song.getDurationInSeconds());
        }
    }

    public Playlist filterPlaylistByTitle(String title) {
        Playlist filtered = new Playlist();
        for (Song song : songs) {
            if (song.getTitle() == title) {
                filtered.addSong((new Song(song.getTitle(), song.getArtist(), song.getDurationInSeconds())));
            }
        }

        return filtered;
    }
}
