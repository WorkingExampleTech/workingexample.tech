package working.example.tech.LLD.YouTubeVideoHistory;

public class Video {
    private String videoId;
    private String videoFormat;
    private String VideoLenInSec;
    private String VideoFirstPublishedDate;
    private String ChannelName;

    public Video(String videoId, String videoFormat,
                 String videoLenInSec, String videoFirstPublishedDate, String channelName) {
        this.videoId = videoId;
        this.videoFormat = videoFormat;
        VideoLenInSec = videoLenInSec;
        VideoFirstPublishedDate = videoFirstPublishedDate;
        ChannelName = channelName;
    }

    public String getVideoId() {
        return videoId;
    }

    public String getVideoFormat() {
        return videoFormat;
    }

    public String getVideoLenInSec() {
        return VideoLenInSec;
    }

    public String getVideoFirstPublishedDate() {
        return VideoFirstPublishedDate;
    }

    public String getChannelName() {
        return ChannelName;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoId='" + videoId + '\'' +
                ", videoFormat='" + videoFormat + '\'' +
                ", VideoLenInSec='" + VideoLenInSec + '\'' +
                ", VideoFirstPublishedDate='" + VideoFirstPublishedDate + '\'' +
                ", ChannelName='" + ChannelName + '\'' +
                '}';
    }
}
