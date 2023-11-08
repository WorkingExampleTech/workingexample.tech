import working.example.tech.InterviewQuestions.ChangeDirectory;
import working.example.tech.InterviewQuestions.LesserElementBST;
import working.example.tech.LLD.YouTubeVideoHistory.YoutubeAppController;
import working.example.tech.LastWatchedYoutubeVideo.
        WatchedVideoDayHistory;

import working.example.tech.interfaces.TestCaseRunner;
public class Main {
    public static void main(String[] args) {
        /*TestCaseRunner wVideoHist = new WatchedVideoDayHistory();
        wVideoHist.RunTest();
        TestCaseRunner youTubeContoller = new YoutubeAppController();
        youTubeContoller.RunTest();
        ChangeDirectory cd = new ChangeDirectory();
        cd.RunTest();*/
        TestCaseRunner lesserElm = new LesserElementBST();
        lesserElm.RunTest();
    }
}