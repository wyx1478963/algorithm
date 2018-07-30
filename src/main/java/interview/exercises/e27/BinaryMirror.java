package interview.exercises.e27;

import interview.exercises.base.TreeNode;

/**
 * 二叉树的镜像
 */
public class BinaryMirror {
    public static TreeNode mirror(TreeNode treeNode) {
        if (treeNode == null) {
            return null;
        }
        swap(treeNode);
        mirror(treeNode.left);
        mirror(treeNode.right);
        return treeNode;
    }

    public static void swap(TreeNode treeNode) {
        TreeNode tmp = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = tmp;
    }
}
