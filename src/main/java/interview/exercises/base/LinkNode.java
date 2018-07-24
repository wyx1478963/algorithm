package interview.exercises.base;

public class LinkNode {
    public int val;
    public LinkNode next;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }


    public static LinkNode constructLinkNode(int[] nodes) {
        LinkNode head = new LinkNode();
        LinkNode p = head;
        for (int node : nodes) {
            LinkNode nodeP = new LinkNode();
            nodeP.val = node;
            p.next = nodeP;
            p = p.next;
        }
        return head.next;
    }

    public static void printLinkNode(LinkNode head) {
        LinkNode p = head;
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}
