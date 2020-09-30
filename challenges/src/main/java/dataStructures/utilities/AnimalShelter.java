package dataStructures.utilities;

public class AnimalShelter {

//    StackGeneric.gNode<String> front;
//    StackGeneric.gNode<String> back;
//
//
//    public void enqueue(String animal) {
//        StackGeneric.gNode<String> newAnimal = new StackGeneric.gNode<>(animal);
//        if (front != null) {
//            newAnimal.setLast(back);
//            back.next = newAnimal;
//
//        } else {
//            front = newAnimal;
//        }
//        back = newAnimal;
//    }
//
//    public String dequeue(String pref) {
//        if (pref == "cat" || pref == "dog") {
//            if (front == null) {
//                return "We are out of animals";
//            }
//
//            StackGeneric.gNode<String> thisNode = front;
//            while (thisNode != null) {
//                if (thisNode.getValue() == pref) {
//                    thisNode.getLast().setNext(thisNode.getNext());
//                    thisNode.getNext().setLast(thisNode.getNext());
//                    return thisNode.getValue();
//                }
//                thisNode = thisNode.getNext();
//            }
//            return String.format("Sorry, we are out of animals");
//        }
//        return null;
//    }
//
//
//    @Override
//    public String toString() {
//        return "StackGeneric{" +
//                "front=" + front +
//                ", back=" + back +
//                '}';
//    }
//
//    public static class gNode<T> {
//        T value;
//        StackGeneric.gNode<T> next;
//        StackGeneric.gNode<T> last;
//
////        public gNode(T value) {
////            this.value = value;
////        }
//
//        public gNode(T value) {
//            this.value = value;
//            this.next = null;
//            this.last = null;
//        }
//
//        public StackGeneric.gNode<T> getLast() {
//            return last;
//        }
//
//        public void setLast(StackGeneric.gNode<T> last) {
//            this.last = last;
//        }
//
//        public T getValue() {
//            return value;
//        }
//
//        public void setValue(T value) {
//            this.value = value;
//        }
//
//        public StackGeneric.gNode<T> getNext() {
//            return next;
//        }
//
//        public void setNext(StackGeneric.gNode<T> next) {
//            this.next = next;
//        }
//
//        @Override
//        public String toString() {
//            return "gNode{" +
//                    "value=" + value +
//                    ", next=" + next +
//                    '}';
//        }
//    }


}
