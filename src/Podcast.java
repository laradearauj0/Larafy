public class Podcast extends Audio {
    private String host;
    private String topic;

    public Podcast(int volume, double duration, boolean isPlaying, int streams, String host, String topic) {
        super(volume, duration, isPlaying, streams);
        this.host = host;
        this.topic = topic;
    }

    public void displayInfo() {
        System.out.println("--------------PODCAST INFO------------------");
        super.displayInfo();
        System.out.println("Host: " + host);
        System.out.println("Topic: " + topic);
        System.out.println("-------------------------------------------");
    }

    public String getHost() {
        return host;
    }

    public String getTopic() {
        return topic;
    }
}
