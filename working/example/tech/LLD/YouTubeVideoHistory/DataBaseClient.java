package working.example.tech.LLD.YouTubeVideoHistory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseClient {
    public Map<Integer, List<Video>> getLastWatchedVideo(User user, int noOfDays) {
        //here it connects to the server DB to get the info.
        //returning dummy values just to demonstrate
        Map<Integer, List<Video>> lastNdaysVideos = new HashMap<>();
        List<Video> one = new ArrayList<>();
        List<Video> two = new ArrayList<>();
        one.add(new Video("123",
                "mp4", "5","12-1-23","a"));
        one.add(new Video("598",
                "mp4", "35","12-5-23","b"));
        one.add(new Video("098",
                "mp4", "55","12-7-23","c"));
        one.add(new Video("124",
                "mp4", "52","12-6-23","d"));

        two.add(new Video("067",
                "mp4", "59","12-9-23","e"));
        two.add(new Video("354",
                "mp4", "53","12-2-23","f"));
        two.add(new Video("678",
                "mp4", "51","12-1-23","g"));
        two.add(new Video("989",
                "mp4", "50","12-3-23","a"));
        lastNdaysVideos.put(1, one);
        lastNdaysVideos.put(2, two);
        return lastNdaysVideos;
    }
}
