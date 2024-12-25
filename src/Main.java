import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Music music = new Music("genre", 1, "name"){};

        ArrayList<Music> musics = new ArrayList<Music>();

        musics.add(music);

       Album album = new Album("Album name", 2001, musics);

        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(album);

        Artist artist = new Artist("Artist Name", albums);

        ArrayList<Artist> artists = new ArrayList<Artist>();
        artists.add(artist);

        MusicLibrary library = new MusicLibrary(artists,albums, musics);

        library.displayInfo();

        System.out.println(library.giveRandomSong());

    }
}