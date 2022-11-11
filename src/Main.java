public class Main {
    public static void main(String[] args) {

        Node node = new Node(10);
        node.addNode(17);
        node.next.addNode(100);
        node.next.next.addNode(200);
        LinkedList list = new LinkedList(node);
        list.printlist();
        System.out.println(list.getLength());
        list.delNode(6);
        list.printlist();
    }
}