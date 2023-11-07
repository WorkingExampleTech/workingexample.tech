package working.example.tech.LLD.YouTubeVideoHistory;
import working.example.tech.interfaces.TestCaseRunner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YoutubeAppController implements TestCaseRunner {
    private VideoRecommendationSystemClient vRecSys;
    private SearchQuery searchQuery;
    private WatchedHistory wHis;
    private VideoLibrary videoLib;
    private VideoPlayer videoPlayer;
    private  User user;
    public YoutubeAppController() {
        this.vRecSys = new VideoRecommendationSystemClient();
        this.searchQuery = new SearchQuery();
        this.wHis = new WatchedHistory();
        this.videoLib = new VideoLibrary();
        this.videoPlayer = new VideoPlayer();
        this.user = new User("1234", "WorkingExample", "");
    }
    public void RunTest() {
        System.out.println("Opening the Youtube APP");
        videoPlayer.addSubscriber(wHis.getListener());
        videoLib.setSearchResultToScroll(searchQuery.getSearchResult("Default"));
        for (int current = 0 ; current < 2; current++) {
            videoLib.scroll(current);
            videoPlayer.play(videoLib.select(current, user), user);
        }
        System.out.println("Get Watched history for user: " + user.toString());
        Map<Integer, List<Video>> his = wHis.getHistory(user, 2);
        for(Map.Entry<Integer, List<Video>> entry : his.entrySet()) {
            System.out.println("History for today - " + entry.getKey());
            for(Video in : entry.getValue()) {
                System.out.println(in);
            }
        }

    }
    public void showOut() {}
}
