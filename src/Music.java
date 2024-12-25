public abstract class Music extends Playable{
    String title;
    int duration;
    String genre;
    boolean MusicIsRunning;

    public Music(String genre, int duration, String title) {
        this.genre = genre;
        this.duration = duration;
        this.title = title;
    }

    public void play(){
        MusicIsRunning = true;
    }

    public void stop(){
        MusicIsRunning = false;
    }
}
