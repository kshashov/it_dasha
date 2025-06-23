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


//        public void put(int add) {
//            if (contains(add) == true) {
//                System.out.println("Значение существует");
//            }
//
//        }

        public Node findParent(int num) {

            if (left != null) {
                if (left.value == num) {
                    return this;
                } else {
                    Node result = left.findParent(num);
                    if (result != null) {
                        return result;
                    }
                }
            }

            if (right != null) {
                if (right.value == num) {
                    return this;
                } else {
                    Node result = right.findParent(num);
                    if (result != null) {
                        return result;
                    }
                }
            }

            return null;
        }


        public void remove(int number) {
            Node parent = findParent(number);
            Node childRight = parent.right;
            Node childLeft = parent.left;
            if (number == childRight.value) {
                if (childRight.right == null && childRight.left == null) {
                    parent.right = null;
                }
                if (childRight.left != null) {
                    if (childRight.right != null) {
                        childRight.right.findLeft().left = childRight.left;
                        parent.right = childRight.right;
                    } else {
                        parent.right = childRight.left;
                    }
                } else if (childRight.right != null) {
                    parent.right = childRight.right;
                }
//                конец правой ветки
            } else if (number == childLeft.value) {
                if (childLeft.right == null && childLeft.left == null) {
                    parent.left = null;
                }
                if (childLeft.left != null) {
                    if (childLeft.right != null) {
                        childLeft.right.findLeft().left = childLeft.left;
                        parent.left = childLeft.right;
                    } else {
                        parent.left = childLeft.left;
                    }
                } else if (childLeft.right != null) {
                    parent.left = childLeft.right;
                }
// конец левой ветки
            }
//            конец
        }

        public Node findLeft() {
            if (left == null) return this;
            else return left.findLeft();
        }


        public static void main(String[] args) {

            Node n26 = new Node(26, null, null);
            Node parent;
            parent = new Node(10,
                    new Node(8,
                            new Node(3, null, null),
                            new Node(9, null, null)),
                    new Node(15,
                            new Node(12,
                                    new Node(11, null, null),
                                    null),
                            new Node(20, null, n26)));
//            System.out.println(parent.sum());
//            System.out.println(parent.findMax());
//            System.out.println(parent.contains(23));
//            System.out.println(parent.contains(12));

//            System.out.println(parent.remove(12));
//            System.out.println(n26);
//            System.out.println(parent.findParent(12).value);
            ;
            parent.remove(8);
            System.out.println(parent.sum());

//            System.out.println(parent.findLeft());
        }

    }
}

