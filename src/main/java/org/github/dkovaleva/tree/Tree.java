package org.github.dkovaleva.tree;

public class Tree {
    Node parent;


    public static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;

            if (left != null) {
                if (left.value >= value) {
                    throw new IllegalArgumentException("Left should be less than current value");
                }
            }

            if (right != null) {
                if (right.value <= value) {
                    throw new IllegalArgumentException("Right should be more than current value");
                }
            }
        }

        public int getValue() {
            return value;
        }

        public int findMax() {
            Node r = this;
            while (r.right != null) {
                r = r.right;
            }
            return r.value;
        }

        public int findMaxRecursive() {
            if (right == null) return value;

            return right.findMaxRecursive();
        }

        public boolean contains(int num) {
            if (num == value) return true;
            if (num < value && left != null) return left.contains(num);
            else if (num > value && right != null) return right.contains(num);

            return false;
        }

        public int sum() {
            int sum = value;

            System.out.println(value);

            if (left != null) {
                sum = sum + left.sum();
            }

            if (right != null) {
                sum = sum + right.sum();
            }

            return sum;
        }


        public static void main(String[] args) {

            Node n26 = new Node(26, null, null);
            Node parent =
                    new Node(10,
                            new Node(8,
                                    new Node(3, null, null),
                                    new Node(9, null, null)),
                            new Node(15,
                                    new Node(12, null, null),
                                    new Node(20,
                                            null,
                                            n26))
                    );
            System.out.println(parent.sum());
//            System.out.println(parent.findMax());
//            System.out.println(parent.contains(23));
//            System.out.println(parent.contains(12));
        }

    }
}
