package interview.exercises.e8;


/**
 * 8. 二叉树的下一个结点
 * 题目描述
 * <p>
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class BinaryTreeNextNode {
    class TreeNode {
        private int val;
        private TreeNode next;
        private TreeNode left;
        private TreeNode right;
    }

    public static TreeNode getNextNode(TreeNode pNode) {
        if (pNode.right != null) {
            TreeNode node = pNode.right;
            while (node.left != null)
                node = node.left;
            return node;
        } else {
            while (pNode.next != null) {
                TreeNode parent = pNode.next;
                if (parent.left == pNode)
                    return parent;
                pNode = pNode.next;
            }
        }
        return null;
    }

}
