package dataStructures.stacksandqueues;

public class PseudoQueue {

    private Stack s1;
    private Stack s2;

    public PseudoQueue(){
        s1 = new Stack();
        s2 = new Stack();
    }

    public Stack getS1() {
        return s1;
    }

    public void enqueue(int value){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(value);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int deQueue(){
        if(s1.isEmpty()){
            System.out.println("Q is empty");
            return -1;
        }
        int value = s1.peek();
        s1.pop();
        return s1.pop();

    }

    @Override
    public String toString() {
        return "PseudoQueue{" +
                "s1=" + s1.top +
                ", s2=" + s2.top +
                '}';
    }
}
