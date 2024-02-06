package LinkedList_Problems;

public class LoopDetection {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        node.next=node1;
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        node1.next=node2;
        node2.next=node3;

        System.out.println(isLoop(node));
    }
    public static boolean isLoop(Node node){

        Node fast = node, slow = node;

        while( fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        return fast == slow;
    }
}
