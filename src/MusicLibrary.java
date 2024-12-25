import java.util.ArrayList;

public class MusicLibrary {
    ArrayList<Artist> artists = new ArrayList<Artist>();
    ArrayList<Album> albums = new ArrayList<Album>();
    ArrayList<Music> songs = new ArrayList<Music>();

    public MusicLibrary(ArrayList<Artist> artists, ArrayList<Album> albums, ArrayList<Music> songs) {
        this.artists = artists;
        this.albums = albums;
        this.songs = songs;
    }

    public void removeAlbum(Album album){
        if(albums.contains(album)){
            albums.remove(album);
        }else{
            System.out.println("this list does not contain this item");
        }
    }

    public void removeSong(Music music){
        if(songs.contains(music)){
            songs.remove(music);
        }else{
            System.out.println("this list does not contain this item");
        }
    }

    public void removeArtist(Artist artist){
        if(artists.contains(artist)){
            artists.remove(artist);
        }else{
            System.out.println("this list does not contain this item");
        }
    }

    public void SearchMusic(String title){
        for(int i = 0; i < (songs.size()+1); i++){
           if(songs.get(i).title == title){
              System.out.println("found your song: " + songs.get(i));
               break;
           }else{
               System.out.println("song not found");
           }
        }
    }

    public Music giveRandomSong(){
        return songs.get((int)(Math.random() * songs.toArray().length));
    }



    public void displayInfo() {
        System.out.println("Artists: " + artists);
        System.out.println("Albums: " + albums);
        System.out.println("Songs: " + songs);
    }
}
