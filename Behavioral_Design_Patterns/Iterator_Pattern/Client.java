package Iterator_Pattern;

public class Client {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song 1"));
        playlist.addSong(new Song("Song 2"));
        playlist.addSong(new Song("Song 3"));

        Iterator<Song> songIterator = playlist.createIterator();
        while (songIterator.hasNext()) {
            System.out.println("Playing: " + songIterator.next().getTitle());
        }
    }
}
