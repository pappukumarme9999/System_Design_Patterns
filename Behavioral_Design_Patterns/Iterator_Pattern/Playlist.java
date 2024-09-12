package Iterator_Pattern;

// Aggregate

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public Iterator<Song> createIterator() {
        return new SongIterator(songs);
    }
}
