public class Node {
    private int value;
    public Node next;
    public Node(int value) {
        this.value = value;
    }
    public void addNode(int value) {
        this.next = new Node(value);
    }
    public int getValue() {
        return this.value;
    }
}
