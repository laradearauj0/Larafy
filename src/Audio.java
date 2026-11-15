public class Audio implements Playable {
    private int volume;
    private double duration;
    private boolean isPlaying;
    private int streams;

    public Audio(int volume, double duration, boolean isPlaying, int streams) {
        this.volume = volume;
        this.duration = duration;
        this.isPlaying = isPlaying;
        this.streams = streams;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;       
        
    }

    public double getDuration() {
        return duration;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public int getStreams() {
        return streams;
    }

    @Override
    public int alterVolume(int option) {
    switch (option) {
        case 1:
            volume += 10;
            break;
        case 2:
            volume -= 10;
            break;
        case 3:
            volume = 0;
            break;
        default:
            System.out.println("Invalid option. Please try again.");
            break;
    }
    return volume;
}


    @Override
    public boolean play() {
        if (!isPlaying) {
            isPlaying = true;
            streams++;
            System.out.println("Audio is now playing.");
            return true;
        } else {
            System.out.println("Audio is already playing.");
            return false;
        }

    }

    @Override
    public boolean pause() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Audio is now paused.");
            return true;
        } else {
            System.out.println("Audio is already paused.");
            return false;
        }
    }

    public void displayInfo() {
        System.out.println("Volume: " + volume);
        System.out.println("Duration: " + duration);
        System.out.println("Is Playing: " + isPlaying);
        System.out.println("Streams: " + streams);
    }

    
}