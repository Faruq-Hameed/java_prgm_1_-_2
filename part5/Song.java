package part5;

public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Song compare) {
        if (this.equals(compare)) {
            return true;
        }
        if (!(compare instanceof Song)) {
            return false;
        }
        Song comparedSong = (Song) compare;

        if (this.artist.equals(comparedSong.artist) && this.name.equals(comparedSong.name)
                && this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }
        return false;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }


    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public Song copy(){
        return this;
    }

    public Song clone (){
        Song copySong = new Song(this.artist, this.name, this.durationInSeconds);
        return copySong;
    }
}
