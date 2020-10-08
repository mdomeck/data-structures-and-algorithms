package dataStructures.tree;

import dataStructures.utilities.StackGeneric;

import java.util.EmptyStackException;

public class Gqueue <T>{

        private StackGeneric.gNode<T> front=null;
        private StackGeneric.gNode<T> rear = null;
        // checks if the stack is empty
        public boolean isEmpty(){
            return front==null;
        }
        // returns the value of the top of the Stack
        public T peek () throws EmptyStackException {
            if (isEmpty()) {throw new EmptyStackException();}
            return front.getValue();
        }
        //     add values to the front of the queue
        public void enqueue(T val){
            StackGeneric.gNode<T> newNode = new StackGeneric.gNode(val);
            if (isEmpty()){
                rear = newNode;
                front = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }
        // remove the front of the queueu
        public T dequeue() throws EmptyStackException {
            if (front == null){
                throw new EmptyStackException();
            }
            StackGeneric.gNode<T> temp = front;
            front = temp.next;
            return temp.getValue();
        }
    }

