package working.example.tech.LLD.YouTubeVideoHistory;

import java.util.ArrayList;
import java.util.List;

public class VideoLibrary {
    List<Video> searchResultToScroll;

    public void setSearchResultToScroll(List<Video> searchResultToScroll) {
        this.searchResultToScroll = searchResultToScroll;
    }
    public int scroll(int CurrentPos) {
        //Single call to this method would help scroll through screen next 2 video
        CurrentPos += 2;
        System.out.println("Scrolling through... now at video: " + CurrentPos);
        return CurrentPos;
    }
    public Video select(int posOfSelectedVideo, User user) {
        Video out = searchResultToScroll.get(posOfSelectedVideo);
        System.out.println("selected video details:" + out.toString());
        return out;
    }
}
