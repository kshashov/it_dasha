package org.github.dkovaleva;

public class SuperLinkedList2 {
    private Node first;


    public int get(int i) {
        return 0;
    }

    public void set(int i, int number) {

    }

    public void addFirst(int number) {

    }

    public void add(int i, int number) {

    }

    private Node getNode(int i) {
        return null;
    }

    public int size() {
        if (first == null) return 0;
        int count = 1;
        Node node = first;
        while (node.next != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public void delete(int i) {

    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size(); i++) {
            result += " " + get(i);
        }
        return result;
    }

    public static class Node {
        public int value;
        public Node next;
    }

    public static void main(String[] args) {
        SuperLinkedList2 list = new SuperLinkedList2();

        for (int i = 0; i < 10; i++) {
            list.add(i, i + 1);
        }

        System.out.println(list);

        list.delete(5);
        list.delete(0);
        list.delete(7);

        System.out.println(list);

        list.addFirst(3456);

        System.out.println(list);

    }
}
