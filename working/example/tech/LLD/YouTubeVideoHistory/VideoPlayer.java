package working.example.tech.LLD.YouTubeVideoHistory;

import java.util.ArrayList;
import java.util.List;

public class VideoPlayer {
    List<VideoStartedStatusListener> listeners;
    boolean exited;
    public VideoPlayer() {
        listeners = new ArrayList<>();
        exited = false;
    }

    public void addSubscriber(VideoStartedStatusListener listener) {
        listeners.add(listener);
    }
    public void play(Video video, User user) {
        System.out.println("Now playing Ads");
        synchronized (this) {
            if (exited) {
                // setting the exit status for next video to false
                exited = false;
                return;
            }
        }
        for(VideoStartedStatusListener listener : listeners) {
            System.out.println("Notifying video Started to: " + listener.getListenerName());
            listener.notify(user,video);
        }
        System.out.println("Now playing Video: " + video.getVideoId() + " for: " +
                video.getVideoLenInSec() + "sec");
        System.out.println("Exiting");
    }
    public void pause(Video video) {
        System.out.println("Paused Video" + video.getVideoId());
    }
    public void exit(Video video) {
        synchronized (this) {
            this.exited = true;
        }
        System.out.println("Force exiting Video" + video.getVideoId());
    }

}
