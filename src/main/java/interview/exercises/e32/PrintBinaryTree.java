package interview.exercises.e32;

import interview.exercises.base.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * <p>
 * 例如，以下二叉树层次遍历的结果为：1,2,3,4,5,6,7
 */
public class PrintBinaryTree {
    private static Queue<TreeNode> queue = new LinkedList<>();

    public static void printBinaryTree(TreeNode treeNode) {
        if (treeNode != null) {
            queue.add(treeNode);
        }
        while(!queue.isEmpty()){
            TreeNode treeNode1 = queue.poll();
            System.out.println(treeNode1.val);
            if (treeNode1.left != null) {
                queue.add(treeNode1.left);
            }
            if (treeNode1.right != null) {
                queue.add(treeNode1.right);
            }
        }
    }
}
