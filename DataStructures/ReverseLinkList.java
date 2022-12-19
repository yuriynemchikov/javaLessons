package DataStructures;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkList {
    public static void main(String[] args) {

        LinkList<Numbers> nums = new LinkList<>();

        nums.addToEnd(new Numbers(1, 5));
        nums.addToEnd(new Numbers(2, 4));
        nums.addToEnd(new Numbers(3, 8));

        for (Numbers n : nums){
            System.out.println(n);
        }

        nums.reverse();
        System.out.println("______________________");

        for(Numbers n : nums){
            System.out.println(n);
        }

    }

    public static class Numbers{
        int id;
        int num;

        public Numbers(int id, int num) {
            this.id = id;
            this.num = num;
        }

        @Override
        public String toString() {
            return "Numbers{" +
                    "id=" + id +
                    ", num=" + num +
                    '}';
        }
    }

    public static class LinkList<T> implements Iterable<T>{

        Node<T> head;
        Node<T> tail;

        @Override
        public Iterator<T> iterator() {
            return new Iterator<T>(){

                Node<T> current = head;

                @Override
                public boolean hasNext() {
                    return current != null;
                }

                @Override
                public T next() {
                    T data = current.data;
                    current = current.next;
                    return data;
                }
            };
        }


        private static class Node<T>{
            T data;
            Node next;
        }

        public void addToEnd(T data){

            Node<T> newNode = new Node<>();
            newNode.data = data;
            if (isEmpty()){
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }

        }

        public boolean isEmpty() {
            return head == null;
        }

        public void reverse() {
            if(!isEmpty() && head.next != null){
                tail = head;
                Node<T> current = head.next;
                head.next = null;
                while(current != null){
                    Node<T> next = current.next;
                    current.next = head;
                    head = current;
                    current = next;
                }
            }
        }
    }
}
