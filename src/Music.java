public class Music extends Audio {
    private String artist;
    private String album;
    private String genre;

    public Music(int volume, double duration, boolean isPlaying, int streams, String artist, String album, String genre) {
        super(volume, duration, isPlaying, streams);
        this.artist = artist;
        this.album = album;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }
    

    public String getAlbum() {
        return album;
    }

    public String getGenre() {
        return genre;
    }

    @Override 
    public void displayInfo() {
        System.out.println("--------------MUSIC INFO------------------");
        super.displayInfo();
        System.out.println("Artist: " + artist);
        System.out.println("Album: " + album);
        System.out.println("Genre: " + genre);
        System.out.println("-------------------------------------------");
    }
    
}
