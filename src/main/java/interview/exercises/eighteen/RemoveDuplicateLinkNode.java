package interview.exercises.eighteen;

/**
 * 删除有序链表中重复的结点
 */
public class RemoveDuplicateLinkNode {

    static class LinkNode {
        private int val;
        private LinkNode next;

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
    }

    public static LinkNode removeDuplicate(LinkNode linkNode) {
        LinkNode head = new LinkNode();
        LinkNode headP = head;
        if (linkNode == null) {
            return null;
        }
        LinkNode p = linkNode;
        while (p != null) {
            int oldValue = p.val;
            LinkNode p1 = p.next;
            boolean isDelete = false;
            while (p1 != null && p1.val == oldValue) {
                p = p1;
                p1 = p1.next;
                isDelete = true;
            }
            if (isDelete) {
                p.next = null;
                p = p1;
            }else {
                headP.next = p;
                headP = p;
                p = p1;
            }
        }
        return head.next;
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

    public static void printLinkNode(LinkNode head){
        LinkNode p = head;
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }

    public static void main(String[] args) {
        LinkNode head = constructLinkNode(new int[]{1,2,3,3,3,3,4,5});
        printLinkNode(head);
        System.out.println("华丽分割线");
        printLinkNode(removeDuplicate(head));
    }
}
