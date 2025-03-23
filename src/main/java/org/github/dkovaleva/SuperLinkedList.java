package org.github.dkovaleva;

public class SuperLinkedList {
    private Node first;


    public int get(int i) {
        return getNode(i).value;

    }

    public void set(int i, int number) {
        getNode(i).value = number;
    }

    public void addFirst(int number) {
        Node newFirst = new Node();
        newFirst.value = number;
        newFirst.next = first;
        first = newFirst;
    }

    public void add(int i, int number) {
        if (i == 0) addFirst(number);
        else {
            Node newNode = new Node();
            newNode.value = number;
            if (i == size()) {
                newNode.next = null;
            } else {
                newNode.next = getNode(i);
            }

            Node previous = getNode(i - 1);
            previous.next = newNode;
        }
    }

    private Node getNode(int i) {
        if ((i < 0) || (i >= size())) {
            // TODO
            return null;
        } else {
            Node node = first;
            for (int k = 0; k < i; k++) {
                node = node.next;
            }
            return node;
        }
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
        if (first == null) return;

        if (i == 0) {
            first = first.next;
        } else {
            getNode(i - 1).next = getNode(i).next;
        }
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
        SuperLinkedList list = new SuperLinkedList();

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
