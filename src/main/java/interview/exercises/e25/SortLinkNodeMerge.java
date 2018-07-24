package interview.exercises.e25;

import interview.exercises.base.LinkNode;

/**
 * 合并两个排序的链表
 */
public class SortLinkNodeMerge {

    public static LinkNode mergeTwoSortList(LinkNode a,LinkNode b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        LinkNode linkNode = new LinkNode();
        LinkNode p = linkNode;
        while (a != null && b != null) {
            if (a.val > b.val) {
                p.next = b;
                p = b;
                b = b.next;
            }else {
                p.next = a;
                p = a;
                a = a.next;
            }
        }
        if (a!= null) {
            p.next = a;
        }
        if (b!=null) {
            p.next = b;
        }
        return linkNode.next;
    }

    public static void main(String[] args) {
        LinkNode a = LinkNode.constructLinkNode(new int[]{1,3,5,7,9});
        LinkNode b = LinkNode.constructLinkNode(new int[]{2,4,6,7,9,9,10});
        LinkNode.printLinkNode(mergeTwoSortList(a,b));
    }
}
