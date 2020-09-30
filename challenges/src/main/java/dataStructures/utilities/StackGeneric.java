package dataStructures.utilities;

public class StackGeneric {


    gNode<String> front;
    gNode<String> back;


    public void enqueue(String animal) {
        gNode<String> newAnimal = new gNode<>(animal);
        if (front != null) {
            newAnimal.setLast(back);
            back.next = newAnimal;

        } else {
            front = newAnimal;
        }
        back = newAnimal;
    }

    public String dequeue(String pref) {
        if (pref == "cat" || pref == "dog") {
            if (front == null) {
                return "We are out of animals";
            }

            gNode<String> thisNode = front;
            while (thisNode != null) {
                if (thisNode.getValue() == pref) {
                    thisNode.getLast().setNext(thisNode.getNext());
                    thisNode.getNext().setLast(thisNode.getNext());
                    return thisNode.getValue();
                }
                thisNode = thisNode.getNext();
            }
            return String.format("Sorry, we are out of animals");
        }
        return null;
    }


    @Override
    public String toString() {
        return "StackGeneric{" +
                "front=" + front +
                ", back=" + back +
                '}';
    }

    public static class gNode<T> {
        T value;
        gNode<T> next;
        gNode<T> last;

//        public gNode(T value) {
//            this.value = value;
//        }

        public gNode(T value) {
            this.value = value;
            this.next = null;
            this.last = null;
        }

        public gNode<T> getLast() {
            return last;
        }

        public void setLast(gNode<T> last) {
            this.last = last;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public gNode<T> getNext() {
            return next;
        }

        public void setNext(gNode<T> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "gNode{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }


}
