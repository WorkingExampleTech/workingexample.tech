package working.example.tech.InterviewQuestions;

import java.util.*;

public class MergeKSortedList implements working.example.tech.interfaces.TestCaseRunner{
    @Override
    public void RunTest() {
       Vector<List<Integer>> vec = new Vector<>();
       vec.add(new ArrayList<>());
       vec.add(new ArrayList<>());
       vec.add(new ArrayList<>());
       vec.add(new ArrayList<>());
        PriorityQueue<PriorityQueueNode> priorityQueue =
                new PriorityQueue<>(new PriorityQueueNodeComparator());
        // list 1
        vec.get(0).add(1);
        vec.get(0).add(2);
        vec.get(0).add(4);
        // list 2
        vec.get(1).add(3);
        vec.get(1).add(5);
        vec.get(1).add(10);
        // list 3
        vec.get(2).add(6);
        vec.get(2).add(8);
        vec.get(2).add(12);
        // list 4
        vec.get(3).add(7);
        vec.get(3).add(9);
        vec.get(3).add(11);
        priorityQueue.add(new PriorityQueueNode(vec.get(0).get(0), 0, 0));
        priorityQueue.add(new PriorityQueueNode(vec.get(1).get(0), 0, 1));
        priorityQueue.add(new PriorityQueueNode(vec.get(2).get(0), 0, 2));
        priorityQueue.add(new PriorityQueueNode(vec.get(3).get(0), 0, 3));
        while(!priorityQueue.isEmpty()) {
            int val = priorityQueue.peek().val;
            int listIndex = priorityQueue.peek().listIndex;
            int listId = priorityQueue.peek().listId;
            System.out.println(val);
            priorityQueue.poll();
            if ((listIndex + 1) < vec.get(listId).size()) {
                priorityQueue.add(
                        new PriorityQueueNode(vec.get(listId).get(listIndex + 1),
                                listIndex + 1, listId));
            }
        }
    }

    @Override
    public void showOut() {

    }

    public class PriorityQueueNode {
        private int val;
        private int listIndex;
        private int listId;
        PriorityQueueNode(int val, int listIndex, int listId) {
            this.val = val;
            this.listIndex = listIndex;
            this.listId = listId;
        }
    }

    public class PriorityQueueNodeComparator implements Comparator<PriorityQueueNode> {
        @Override
        public int compare(PriorityQueueNode o1, PriorityQueueNode o2) {
            int key1 = o1.val;
            int key2 = o2.val;
            if (key2 == key1) {
                return 0;
            } else if (key1 < key2) {
                return -1;
            } else {
                return 1;
            }
        }
    }

}
