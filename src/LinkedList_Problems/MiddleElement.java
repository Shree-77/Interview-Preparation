package LinkedList_Problems;

public class MiddleElement {
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(0);

        System.out.println(middleNode(list.get(1)));
    }
        public static int middleNode(Node head) {
            Node fast = head , slow = head;

            while(fast!=null && fast.next!=null){
                fast = fast.next.next;
                slow=slow.next;
            }
            return slow.value;
        }

}
