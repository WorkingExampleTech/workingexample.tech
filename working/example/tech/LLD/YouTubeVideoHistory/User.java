package working.example.tech.LLD.YouTubeVideoHistory;

public class User {

    private String UseId;
    private String userName;
    private String Address;
    /*We can add more details of user as needed*/
    public User(String useId, String userName, String address) {
        UseId = useId;
        this.userName = userName;
        Address = address;
    }

    public String getUseId() {
        return UseId;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddress() {
        return Address;
    }

    @Override
    public String toString() {
        return "User{" +
                "UseId='" + UseId + '\'' +
                ", userName='" + userName + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
