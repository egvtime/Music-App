import java.util.ArrayList;

public class Artist {
    String Name;
    ArrayList<Album> Album = new ArrayList<Album>();

    public Artist(String name, ArrayList<Album> album) {
        Name = name;
        Album = album;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Album> getAlbum() {
        return Album;
    }

    public void setAlbum(ArrayList<Album> album) {
        Album = album;
    }

    public void addAlbum(Album album){
        Album.add(album);
    }

    public void removeAlbum(Album album){
        if(Album.contains(album)){
        Album.remove(album);
        }else{
            System.out.println("this list does not contain this item");
        }
    }

    public void displayInfo(){
        System.out.println("name: " + Name);
        System.out.println("Albums: ");
        for(int i = 0; i < Album.size(); i++){
            System.out.println(Album.get(i));
        }
    }
}
