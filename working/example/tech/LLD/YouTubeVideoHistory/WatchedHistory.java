package working.example.tech.LLD.YouTubeVideoHistory;

import working.example.tech.LastWatchedYoutubeVideo.WatchedVideoDayHistory;

import java.util.List;
import java.util.Map;
import java.util.Vector;

public class WatchedHistory {
     WatchedVideoDayHistory wHisMantain;
     Integer maxStorge;
     VideoStartedListener listener;
     DataBaseClient db;
     public VideoStartedListener getListener() {
        return listener;
     }

    public WatchedHistory() {
        this.wHisMantain = new WatchedVideoDayHistory();
        this.maxStorge = 100;
        this.listener = new VideoStartedListener();
        db = new DataBaseClient();
    }

    class VideoStartedListener implements VideoStartedStatusListener {
        @Override
        public void notify(User user, Video video) {
               updateHistory(user, video);
        }
        @Override
        public String getListenerName() {
            return WatchedHistory.class.toString() + "Listener";
        }
    }
    private void updateHistory(User user, Video video) {
        Vector<String> vec = new Vector<>();
        System.out.println("Adding current video to today History: " + video.toString());
        vec.add(video.getVideoId());
        this.wHisMantain.run(vec, maxStorge);
    }

    public Map<Integer, List<Video>>  getHistory(User user, int lastNDays) {
        return db.getLastWatchedVideo(user, lastNDays);
    }
}
