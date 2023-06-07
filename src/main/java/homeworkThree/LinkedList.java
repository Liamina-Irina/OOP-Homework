package homeworkThree;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public LinkedList() {
        head = null;
        tail = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void add(T value) {
        Node<T> element = new Node<>(value);
        if (size == 0) {
            head = element;
        } else {
            tail.next = element;
            element.prev = tail;
        }
        tail = element;
        size++;
    }

    void addFirst(T element) {
        Node<T> newNode = new Node<>(element);

        if (isEmpty()) tail = newNode;
        else head.prev = newNode;

        newNode.next = head;
        head = newNode;
    }

    void addLast(T element) {
        Node<T> newNode = new Node<>(element);

        if (isEmpty()) head = newNode;
        else tail.next = newNode;

        newNode.prev = tail;
        tail = newNode;
    }

    void addByIndex(T element, int index) {
        Node<T> currentNode = head;

        int c = 0;

        while (currentNode != null && c != index) {
            currentNode = currentNode.next;
            c++;
        }

        Node<T> newNode = new Node<>(element);
        if (currentNode != null) {
            currentNode.prev.next = newNode;
        }
        if (currentNode != null) {
            newNode.prev = currentNode.prev;
        }
        if (currentNode != null) {
            currentNode.prev = newNode;
        }
        newNode.next = currentNode;

    }

    void removeFirst() {

        if (head.next == null) tail = null;
        else head.next.prev = null;

        head = head.next;
    }

    void removeLast() {
        if (head.next == null) tail = null;
        else tail.prev.next = null;

        tail = tail.prev;
    }

    void removeByAt(T key) {
        Node<T> currentNode = head;

        while (currentNode.element != key) {
            currentNode = currentNode.next;

            if (currentNode == null) return;
        }

        if (currentNode == head) removeFirst();
        else currentNode.prev.next = currentNode.next;

        if (currentNode == tail) removeLast();
        else currentNode.next.prev = currentNode.prev;
    }

    void print() {
        Node<T> node = head;

        while (node != null) {
            System.out.println(node.element);
            node = node.next;
        }
    }

    @Override
    public Iterator iterator() {
        return new Iterator<T>() {
            Node<T> currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                var result = currentNode.element;
                currentNode = currentNode.next;
                return result;
            }
        };
    }

    public static class Node<T> {
        public T element;
        public Node<T> next;
        public Node<T> prev;

        public Node(T element) {
            this.element = element;
        }
    }
}