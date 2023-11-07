package working.example.tech.LLD.YouTubeVideoHistory;

import java.util.ArrayList;
import java.util.List;

public class VideoRecommendationSystemClient {
    List<Video> getRecommendedVideosForUser(User user) {
        // here we can contact the server to get the recommendation
        // returning few dummy values for illustration
        List<Video> recomm = new ArrayList<>();
        recomm.add(new Video("123",
                "mp4", "5","12-1-23","a"));
        recomm.add(new Video("456",
                "mp4", "15","12-2-23","b"));
        recomm.add(new Video("567",
                "mp4", "25","12-3-23","c"));
        recomm.add(new Video("890",
                "mp4", "45","12-4-23","d"));
        recomm.add(new Video("345",
                "mp4", "25","12-5-23","e"));
        recomm.add(new Video("453",
                "mp4", "95","12-6-23","f"));
        recomm.add(new Video("346",
                "mp4", "75","12-7-23","g"));
        return recomm;
    }
}
