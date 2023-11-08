package working.example.tech.InterviewQuestions;

import working.example.tech.interfaces.TestCaseRunner;

public class LesserElementBST implements TestCaseRunner {

    class Node {
        Node left;
        Node right;
        Integer data;
        public Node(Integer data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    class BST {
         public void add(Node root, Node node) {
             if (root == null) {
                 root = node;
             }
             if (root.data > node.data) {
                 if (root.left == null) {
                     root.left = node;
                 } else {
                     add(root.left, node);
                 }
             } else {
                 if (root.right == null) {
                     root.right = node;
                 } else {
                     add(root.right, node);
                 }
             }
         }
         public void printBST(Node root) {
             if(root == null) {
                 return;
             }
             printBST(root.left);
             System.out.print(root.data + " ");
             printBST(root.right);
         }
         private Integer findMaxformLeftSubtree(Node root) {
             if (root == null) {
                 return -1;
             }
             while(root.right != null) {
                 root = root.right;
             }
             return root.data;
         }
         public Integer getLesserElementForE(int E, Node root) {
             if (root.data == E) {
                 return findMaxformLeftSubtree(root.left);
             }
             Integer k;
             if (root.data > E) {
                k = getLesserElementForE(E, root.left);
             } else {
                k = getLesserElementForE(E, root.right);
             }
             if (k == -1 && root.data < E) {
                 k = root.data;
             }
             return k;
         }
    }

    @Override
    public void RunTest() {
        BST bst = new BST();
        Node root = new Node(20);
        bst.add(root, new Node(5));
        bst.add(root, new Node(15));
        bst.add(root, new Node(30));
        bst.add(root, new Node(25));
        bst.add(root, new Node(35));
        System.out.println(bst.getLesserElementForE(5, root));
    }

    @Override
    public void showOut() {
        // No implementation
    }
}
