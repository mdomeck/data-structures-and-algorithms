package dataStructures.stacksandqueues;

public class PseudoQueue {

    private Stack s1;
    private Stack s2;


    public PseudoQueue() {
        s1 = new Stack();
        s2 = new Stack();
    }

    public Stack getS1() {
        return s1;
    }

    public void enqueue(int value) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(value);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int deQueue() throws Exception {
        if (s2.isEmpty()) {
            if (s1.isEmpty()) {
                throw new Exception("empty");
            }
            while (!s1.isEmpty()) {
                int value = s1.pop();
                s2.push(value);
            }
        }
        return s2.pop();

    }
    


    @Override
    public String toString() {
        return "PseudoQueue{" +
                "s1=" + s1.top +
                ", s2=" + s2.top +
                '}';
    }
}

