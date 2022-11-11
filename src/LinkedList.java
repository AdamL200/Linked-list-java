
public class LinkedList {
    private Node head;
    public LinkedList(Node head) {
        this.head = head;
    }
    public void printlist() {
        Node nodeCopy = this.head;
        System.out.println(nodeCopy.getValue());
        while (nodeCopy.next != null) {
            nodeCopy = nodeCopy.next;
            System.out.println(nodeCopy.getValue());

        }
    }
    public int getLength() {
        int len = 1;
        Node nodeCopy = this.head;
        while (nodeCopy.next != null) {
            nodeCopy = nodeCopy.next;
            len++;
        }
        return len;
    }
    public void delNode(int index) {
        Node temp = this.head;
        Node prev = null;
        if (index >= this.getLength()) {
            System.out.println("Index out of range");
            return;
        }
        else if (index == 0) { //if want to remove the 1st element
            this.head = this.head.next;
        }
        else {

            for (int i=0;i<index;i++) {
                prev = temp;
                temp = temp.next;
                System.out.println(temp.getValue());
                }
            prev.next = temp.next;

            }
        System.out.println("Deleted element at index "+index);
        }
    public void reverseList() {
        //todo
    }


}
