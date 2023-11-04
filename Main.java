import working.example.tech.LastWatchedYoutubeVideo.
        WatchedVideoDayHistory;

import working.example.tech.interfaces.TestCaseRunner;
public class Main {
    public static void main(String[] args) {
        TestCaseRunner wVideoHist = new WatchedVideoDayHistory();
        wVideoHist.RunTest();
    }
}