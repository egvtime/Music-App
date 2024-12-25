import java.util.ArrayList;

public class Album {
   private String name;
   private int ReleaseYear;
   private ArrayList<Music> Musics = new ArrayList<Music>();

    public Album(String name, int releaseYear, ArrayList<Music> musics) {
        this.name = name;
        ReleaseYear = releaseYear;
        Musics = musics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void AddSong(Music music){
        Musics.add(music);
    }
}
