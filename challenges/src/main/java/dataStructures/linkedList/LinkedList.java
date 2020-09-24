package dataStructures.linkedList;

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
    public Node next;

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

    public void insertEnd(int value) {
        Node newNode = new Node(value);
        if (this.tail == null) {
            this.tail = newNode;
            this.head = newNode;
        } else {
            this.tail.next = newNode;
            tail = newNode;
        }

    }

    public int findKFromEnd(int k) throws IndexOutOfBoundsException {
        Node current = this.head;

        if(k < 0){
            throw new IndexOutOfBoundsException("Value entered is a negative number");
        }

        while (current != null) {
            Node kAway = current;
            for (int i = 0; i < k; i++) {
                if (kAway.next == null && i != k - 1) {
                    throw new IndexOutOfBoundsException("Value entered is greater than total linked list");
                }
                kAway = kAway.next;
            }
            if (kAway.next == null) {
                return current.value;
            }
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Value entered is greater than total linked list length");

    }



    public void insertBefore(int value, int newValue) {
        Node newNode = new Node(newValue);
        Node lastNode = this.head;
        Node currentNode = this.head;

        if (head != null) {
            while (currentNode.next != null) {
                if (currentNode.value == value) {
                    lastNode.next = newNode;
                    newNode.next = currentNode;
                    return;
                } else {
                    lastNode = currentNode;
                    currentNode = currentNode.next;
                }
            }
            System.out.println("Search value is not found");

        } else {
            System.out.println("List is empty");
        }
    }

    public void insertAfter(int value, int newValue) {
        Node newNode = new Node(newValue);
        Node nextNode = this.head.next;
        Node currentNode = this.head;

        if (head != null) {
            while (currentNode.next != null) {
                if (currentNode.value == value) {
                    currentNode.next = newNode;
                    newNode.next = nextNode;
                    return;
                } else {
                    currentNode = nextNode;
                    nextNode = nextNode.next;
                }
            }
            System.out.println("Search value is not found");

        } else {
            System.out.println("List is empty");
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


    public static LinkedList zipLists(LinkedList one, LinkedList two) {

        if(one == null){
            return two;
        } else if (two == null){
            return one;
        }

        Node head1 = one.head;
        Node head2 = two.head;
        Node temp1 = head1.next;
        Node temp2 = head2.next;
        LinkedList newList = new LinkedList();
        newList.insert(head1.value);
        newList.insert(head2.value);

        while(temp1 != null && temp2 != null) {
            newList.insert(temp1.value);
            temp1 = temp1.next;
            newList.insert(temp2.value);
            temp2 = temp2.next;
        }
            return newList;

        }
    }
