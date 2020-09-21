package linkedList;

public class LinkedList {
    public class Node {

        public int value;
        public Node next;

        public Node(int number) {
            this.value = number;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            Node tempNode = this.head;
            this.head = node;
            node.next = tempNode;
        }
    }

    public boolean includes(int value) {
        Node nodeOfHead = this.head;
        while (nodeOfHead != null) {
            if (nodeOfHead.value == value) {
                return true;
            } else {
                nodeOfHead = nodeOfHead.next;
            }
        }
        return false;
    }


    public String toString() {
        if (this.head == null) {
            return "NULL";
        }

        Node nodeImLookingAt = this.head;
        String output = String.format("{%d} -> ", nodeImLookingAt.value);
        nodeImLookingAt = nodeImLookingAt.next;

        while (nodeImLookingAt != null) {
            output += String.format("{%d} -> ", nodeImLookingAt.value);
            nodeImLookingAt = nodeImLookingAt.next;
        }
        output += "NULL";

        return output;
    }

//    public String toString() {
//        String output = "";
//        Node nodeImLookingAt = this.head;
//        while (nodeImLookingAt != null) {
//            output = output + nodeImLookingAt.value + " ";
//            nodeImLookingAt = nodeImLookingAt.next;
//        }
//        output = output + "null";
//        return output;
//    }

}
