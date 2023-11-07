package working.example.tech.LastWatchedYoutubeVideo;
import working.example.tech.interfaces.TestCaseRunner;
import java.util.HashMap;
import java.util.Vector;
public class WatchedVideoDayHistory implements TestCaseRunner {
    private VideoDoublyLinkedList DLL;
    HashMap<String, VideoDoublyLinkedList.Node> videoMap;
    public WatchedVideoDayHistory() {
        videoMap = new HashMap<>();
        DLL = new VideoDoublyLinkedList();
    }

    public void run(Vector<String> listOfvideoId, Integer perDayHistorySize) {
        for (String videoId : listOfvideoId) {
            VideoDoublyLinkedList.Node exist = videoMap.get(videoId);
            if (videoMap.size() < perDayHistorySize) {
                if (exist == null) {
                    videoMap.put(videoId, DLL.add(videoId)) ;
                } else {
                    DLL.remove(exist);
                    videoMap.put(videoId, DLL.add(videoId));
                }
            } else {
                // replace existing and add new
                DLL.remove(DLL.getTail());
                DLL.add(videoId);
            }
            showOut();
            System.out.println();
        }
    }
    @Override
    public void RunTest() {
        Vector<String> list = new Vector<>();
        list.add("123");
        list.add("234");
        list.add("345");
        list.add("123");
        list.add("432");
        list.add("456");
        list.add("345");
        list.add("432");
        list.add("432");
        this.run(list, 100);
    }

    @Override
    public void showOut() {
        VideoDoublyLinkedList.Node head = DLL.getHead();
        System.out.print("Today's Last Watched History:");
        while(head != null) {
            System.out.print(" " + head.VideoId);
            head = head.next;
        }
    }
}