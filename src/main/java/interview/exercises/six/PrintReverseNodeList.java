package interview.exercises.six;

import java.util.Stack;

/**
 * 输入链表的第一个节点，从尾到头反过来打印出每个结点的值。
 */
public class PrintReverseNodeList {
    static class Node {
        private Node next;
        private int val;

        public Node(int val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }

    public static Node constructNodeList(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        Node head = new Node(array[0]);
        Node p = head;
        for (int i = 1; i < array.length; i++) {
            p.setNext(new Node(array[i]));
            p = p.getNext();
        }

        return head;
    }

    /**
     * 使用栈或者数组 来表示
     *
     * @param node
     */
    public static void reversePrint(Node node) {
        Node p = node;
        //数组倒序同理
        Stack<Integer> stack = new Stack<>();
        while (p != null) {
            stack.push(p.val);
            p = p.getNext();
        }
        while (!stack.isEmpty()) {
            Integer item = stack.pop();
            System.out.print(item);
            System.out.print(" ");
        }
    }

    /**
     * 反转链表
     *
     * @param node
     */
    public static void reversePrint2(Node node) {
        Node p = node;
        if (p.getNext() == null) {
            System.out.println(p.getVal());
            return;
        }
        Node pn = p.getNext();
        Node p1 = p.getNext();
        p.next = null;
        while (pn != null) {
            pn = pn.getNext();
            p1.setNext(p);
            p = p1;
            p1 = pn;
        }

        while (p != null) {
            System.out.print(p.val);
            System.out.print(" ");
            p = p.getNext();
        }
    }

    /**
     * 递归
     *
     * @param node
     */
    public static void reversePrint3(Node node) {
        if (node.getNext() == null) {
            System.out.print(node.val);
            System.out.print(" ");
            return;
        }
        reversePrint3(node.getNext());
        System.out.print(node.val);
        System.out.print(" ");
    }

    public static void main(String[] args) {
        Node node = constructNodeList(new int[]{1, 2, 3, 4, 5});
//        reversePrint(node);
//        reversePrint2(node);
        reversePrint3(node);
    }
}
