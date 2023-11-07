package working.example.tech.LastWatchedYoutubeVideo;
public class VideoDoublyLinkedList {
    private Node head;
    private Node tail;


    public VideoDoublyLinkedList() {
        head = null;
        tail = null;
    }
    class Node {
        String VideoId;
        Node next;
        Node prev;
        public Node(String  videoId, Node next, Node prev) {
            VideoId = videoId;
            this.next = next;
            this.prev = prev;
        }
    }

    public Node add(String Id) {
        Node node = new Node(Id, null, null);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        return node;
    }

    public Node remove(Node in) {
        Node deleted = in;
        if (in == head && in == tail) {
            head = null;
            tail = null;
        } else if (in == head) {
            head = in.next;
            head.prev.next = null;
            head.prev = null;
        } else if (in == tail) {
            tail = in.prev;
            tail.next.prev = null;
            tail.next = null;
        } else {
            Node tempNode = in.prev;
            tempNode.next = in.next;
            in.prev = null;
        }
        return deleted;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}