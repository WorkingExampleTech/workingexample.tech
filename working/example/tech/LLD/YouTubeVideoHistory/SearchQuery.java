package working.example.tech.LLD.YouTubeVideoHistory;
import java.util.ArrayList;
import java.util.List;
public class SearchQuery {
    List<Video> searchResult;
    public List<Video> getSearchResult(String query) {
        // This method would connect to the Server DB to fetch the result of the
        // query
        searchResult = new ArrayList<>();
        searchResult.add(new Video("123",
                "mp4", "5","12-1-23","a"));
        searchResult.add(new Video("456",
                "mp4", "15","12-2-23","b"));
        searchResult.add(new Video("567",
                "mp4", "25","12-3-23","c"));
        searchResult.add(new Video("890",
                "mp4", "45","12-4-23","d"));
        searchResult.add(new Video("345",
                "mp4", "25","12-5-23","e"));
        searchResult.add(new Video("453",
                "mp4", "95","12-6-23","f"));
        searchResult.add(new Video("346",
                "mp4", "75","12-7-23","g"));
        return searchResult;
    }
}
