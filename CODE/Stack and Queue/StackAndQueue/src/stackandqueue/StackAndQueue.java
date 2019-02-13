/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackandqueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pakbu
 */
public class StackAndQueue {

    public static void main(String[] args) {
        System.out.println("StackAndQueue HomeWork");
        System.out.println("\n================================");
        System.out.println("Queue");
        System.out.println("================================");
        QueueAndStack<String> fruit = new QueueAndStack<>();

        fruit.enQueue("apple");
        fruit.enQueue("banana");
        fruit.enQueue("coconut");
        fruit.enQueue("grape");
        fruit.enQueue("lemon");
        fruit.enQueue("mango");
        fruit.enQueue("orange");

        System.out.println("Before Remove First: " + fruit.firstOfQueue());
        System.out.println("Before List: " + fruit.getList());
        System.out.println("Remove Queue: " + fruit.deQueue());
        System.out.println("After Remove First: " + fruit.firstOfQueue());
        System.out.println("After List: " + fruit.getList());

        System.out.println("\n================================");
        System.out.println("Stack");
        System.out.println("================================");
        fruit.push("apple");
        fruit.push("banana");
        fruit.push("coconut");
        fruit.push("grape");
        fruit.push("lemon");
        fruit.push("mango");
        fruit.push("orange");
        System.out.println("Before Remove Top: " + fruit.topOfStack());
        System.out.println("Before List: " + fruit.getList());
        System.out.println("Remove Top: " + fruit.pop());
        System.out.println("After Remove Top: " + fruit.topOfStack());
        System.out.println("After List: " + fruit.getList());
    }
//interface Stack and Queue

    public interface Stack<T> {

        int size();
        boolean isEmpty();
        void push(T item);
        T pop();
        T topOfStack();
    }

    public interface Queue<T> {

        int size();
        boolean isEmpty();
        void enQueue(T item);
        T deQueue();
        T firstOfQueue();

    }

//implements Stack and Queue   
    public static class QueueAndStack<T> implements Queue<T>, Stack<T> {

        private ArrayList<T> list;

        public QueueAndStack() {
            list = new ArrayList<>();
        }

        @Override
        public int size() {
            return list.size();
        }

        @Override
        public boolean isEmpty() {
            return list.isEmpty();
        }

        @Override
        public void enQueue(T item) {
            list.add(item);
        }

        @Override
        public T deQueue() {
            list.remove(0);
            return list.get(0);
        }

        @Override
        public T firstOfQueue() {
            return list.get(0);
        }

        @Override
        public void push(T item) {
            list.add(item);
        }

        @Override
        public T pop() {
            list.remove(lastPosition());
            return list.get(lastPosition());
        }

        @Override
        public T topOfStack() {
            return list.get(lastPosition());
        }

        public List<T> getList() {
            return list;
        }

        private int lastPosition() {
            return list.size() - 1;
        }

    }
}
