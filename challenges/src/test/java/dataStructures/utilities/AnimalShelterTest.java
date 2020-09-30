package dataStructures.utilities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnimalShelterTest {

    @Test public void stackGenericTest(){
        StackGeneric newStackGeneric = new StackGeneric();
        System.out.println(newStackGeneric);
    }

    @Test public void gNodeTest(){
        StackGeneric newStackGeneric = new StackGeneric();
        StackGeneric.gNode<String> nodeTest = new StackGeneric.gNode<>("dog");
        System.out.println(nodeTest);
    }

    @Test public void animalTest(){
        StackGeneric newStackGeneric = new StackGeneric();
        StackGeneric.gNode<String> nodeTest = new StackGeneric.gNode<>("dog");
        newStackGeneric.enqueue("cat");
        newStackGeneric.enqueue("dog");
        newStackGeneric.enqueue("dog");
        newStackGeneric.enqueue("dog");
        newStackGeneric.enqueue("cat");
        newStackGeneric.enqueue("dog");
        System.out.println(newStackGeneric.toString());
        assertTrue(newStackGeneric.back.value == "dog");
    }

    @Test public void dequeueTest(){
        StackGeneric newStackGeneric = new StackGeneric();
        StackGeneric.gNode<String> nodeTest = new StackGeneric.gNode<>("dog");
        newStackGeneric.enqueue("dog");
        newStackGeneric.enqueue("dog");
        newStackGeneric.enqueue("cat");
        newStackGeneric.enqueue("dog");
        newStackGeneric.enqueue("dog");
        System.out.println(newStackGeneric.dequeue("cat"));
        System.out.println(newStackGeneric.dequeue("cat"));
        assertTrue(newStackGeneric.dequeue("cat"), true);
    }

    @Test public void shelterNull(){
        StackGeneric newStackGeneric = new StackGeneric();
        StackGeneric.gNode<String> empty = new StackGeneric.gNode<>("null");
        System.out.println(empty);
        assertTrue(empty.value, true);
    }
    @Test public void dequeueOtherAnimalNull(){
        StackGeneric newStackGeneric = new StackGeneric();
        StackGeneric.gNode<String> nullAnimalTest = new StackGeneric.gNode<>("dog");
        newStackGeneric.enqueue("dog");
        newStackGeneric.enqueue("dog");
        newStackGeneric.enqueue("pig");
        System.out.println(newStackGeneric.dequeue("pig"));
        assertTrue(newStackGeneric.dequeue("null"), true);
    }


}
