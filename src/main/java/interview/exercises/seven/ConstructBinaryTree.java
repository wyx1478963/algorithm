//package interview.exercises.seven;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * 根据二叉树的前序遍历和中序遍历的结果，重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
//
// preorder = [3,9,20,15,7]
// inorder =  [9,3,15,20,7]
// */
//public class ConstructBinaryTree {
//    static class TreeNode {
//        private TreeNode left;
//
//        private TreeNode right;
//
//        private Integer val;
//
//        public TreeNode(Integer val) {
//            this.val = val;
//        }
//
//        public TreeNode getLeft() {
//            return left;
//        }
//
//        public void setLeft(TreeNode left) {
//            this.left = left;
//        }
//
//        public TreeNode getRight() {
//            return right;
//        }
//
//        public void setRight(TreeNode right) {
//            this.right = right;
//        }
//
//        public Integer getVal() {
//            return val;
//        }
//
//        public void setVal(Integer val) {
//            this.val = val;
//        }
//    }
//
//    public static TreeNode generateTreeNode(int[] preOrder,int[] infixOrder ) {
//        for (int i = 0; i< )
//
//    }
//
//    public static TreeNode constructTreeNode(int[] preOrder,int[] infixOrder,int leftStart,int leftEnd,int rightStart,int rightEnd){
//
//    }
//
//    private Map<Integer, Integer> inOrderNumsIndexs = new HashMap<>(); // 缓存中序遍历数组的每个值对应的索引
//
//    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
//        for (int i = 0; i < in.length; i++)
//            inOrderNumsIndexs.put(in[i], i);
//        return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
//    }
//
//    private TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int[] in, int inL, int inR) {
//        if (preL > preR)
//            return null;
//        TreeNode root = new TreeNode(pre[preL]);
//        int inIndex = inOrderNumsIndexs.get(root.val);
//        int leftTreeSize = inIndex - inL;
//        root.left = reConstructBinaryTree(pre, preL + 1, preL + leftTreeSize, in, inL, inL + leftTreeSize - 1);
//        root.right = reConstructBinaryTree(pre, preL + leftTreeSize + 1, preR, in, inL + leftTreeSize + 1, inR);
//        return root;
//    }
//}
