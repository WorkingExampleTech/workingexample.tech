package working.example.tech.LLD.YouTubeVideoHistory;

public interface VideoStartedStatusListener {
    void notify(User user, Video video);
    String getListenerName();
}
