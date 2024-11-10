package src.main.java.core.module_9;

import src.main.java.core.module_9.collection.MyArrayList;
import src.main.java.core.module_9.collection.MyLinkedList;
import src.main.java.core.module_9.collection.MyQueue;
import src.main.java.core.module_9.collection.MyStack;
import src.main.java.core.module_9.collection.MyHashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "--- MY ARRAY LIST ---" + "\n");
        MyArrayList<Entity> myArrayList = new MyArrayList<Entity>();
        myArrayList.add(new Entity());
        myArrayList.add(new Entity());
        myArrayList.add(new Entity());
        System.out.println("added three entities: " + myArrayList.toString() + ", size: " +
                myArrayList.size());
        myArrayList.remove(1);
        System.out.println("removed index 1: " + myArrayList.toString() + ", size: "
                +
                myArrayList.size());
        System.out.println("get index 1: " + myArrayList.get(1));
        myArrayList.clear();
        System.out.println("cleared out: " + myArrayList.toString());

        System.out.println("\n" + "--- MY LINKED LIST ---" + "\n");
        MyLinkedList<Entity> myLinkedList = new MyLinkedList<Entity>();
        myLinkedList.add(new Entity());
        myLinkedList.add(new Entity());
        myLinkedList.add(new Entity());
        System.out.println("added three entities: " + myLinkedList.toString() + ", size: " +
                myLinkedList.size());
        myLinkedList.remove(1);
        System.out.println("removed index 1: " + myLinkedList.toString() + ", size: "
                +
                myLinkedList.size());
        System.out.println("get index 1: " + myLinkedList.get(1));
        myLinkedList.clear();
        System.out.println("cleared out: " + myLinkedList.toString());

        System.out.println("\n" + "--- MY QUEUE ---" + "\n");
        MyQueue<Entity> myQueue = new MyQueue<Entity>();
        myQueue.add(new Entity());
        myQueue.add(new Entity());
        myQueue.add(new Entity());
        System.out.println("added three entities: " + myQueue.toString() + ", size: "
                +
                myQueue.size());
        System.out.println("show the first: " + myQueue.peek());
        System.out.println("get the first: " + myQueue.poll());
        System.out.println("updated: " + myQueue.toString() + ", size: " +
                myQueue.size());
        myQueue.clear();
        System.out.println("cleared out: " + myQueue.toString());

        System.out.println("\n" + "--- MY STACK ---" + "\n");
        MyStack<Entity> myStack = new MyStack<Entity>();
        myStack.push(new Entity());
        myStack.push(new Entity());
        myStack.push(new Entity());
        System.out.println("added three entities: " + myStack.toString() + ", size: "
                +
                myStack.size());
        System.out.println("show the first: " + myStack.peek());
        System.out.println("get the first: " + myStack.pop());
        System.out.println("updated: " + myStack.toString() + ", size: " +
                myStack.size());
        myStack.clear();
        System.out.println("cleared out: " + myStack.toString());

        System.out.println("\n" + "--- MY HASH MAP ---" + "\n");
        MyHashMap<Entity, String> countries = new MyHashMap<>();
        Entity entity1 = new Entity(1);
        countries.put(entity1, "Ukraine");
        Entity entity2 = new Entity(2);
        countries.put(entity2, "Spain");
        Entity entity3 = new Entity(3);
        countries.put(entity3, "Germany");

        System.out.println("getting country of entity2: " + countries.get(entity2) + ", map size: " + countries.size());
        countries.remove(entity2);
        System.out
                .println("getting country of entity2, after it has been deleted: " + countries.get(entity2)
                        + ", map size: "
                        + countries.size());
        countries.clear();
        System.out.println("size after clearing: " + countries.size());

    }
}
