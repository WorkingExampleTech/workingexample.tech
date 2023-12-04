package working.example.tech.InterviewQuestions;

public class ReverseSLL implements working.example.tech.interfaces.TestCaseRunner{
    private Node head;
    public  ReverseSLL() {
        head = null;
    }
    private class Node {
        private Integer data;
        private Node next;
        Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }
    private void add(Integer data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    private void reverse() {
        if (head == null || head.next == null) {
            return;
        } else {
            Node current = null;
            Node Next = head;
            while(Next != null) {
                Node temp = Next.next;
                Next.next = current;
                current = Next;
                Next = temp;
            }
            head = current;
        }
    }
    @Override
    public void RunTest() {
        this.add(10);
        this.add(5);
        this.add(30);
        this.add(50);
        this.showOut();
        this.reverse();
        this.showOut();
    }

    @Override
    public void showOut() {
        Node temp = head;
        System.out.println();
        while(temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }
}
