package interview.exercises.e24;

import interview.exercises.base.LinkNode;

/**
 * 反转链表
 */
public class LinkNodeReverse {

    public static LinkNode reverseLinkNode(LinkNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        LinkNode p = head;
        LinkNode p1;
        LinkNode p2 = head.next;
        p.next = null;

        while (p2 != null) {
            p1 = p2;
            p2 = p2.next;
            p1.next= p;
            p = p1;
        }

        return p;
    }


    public static void main(String[] args) {
        LinkNode head = LinkNode.constructLinkNode(new int[]{1,2,3,4,5});
        LinkNode.printLinkNode(reverseLinkNode(head));
    }
}
