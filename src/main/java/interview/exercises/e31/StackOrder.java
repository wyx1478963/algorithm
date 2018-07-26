package interview.exercises.e31;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列 1,2,3,4,5 是某栈的压入顺序，
 * 序列 4,5,3,2,1 是该压栈序列对应的一个弹出序列，但 4,3,5,1,2 就不可能是该压栈序列的弹出序列。
 */
public class StackOrder {
    public static boolean isPopOrder(int[] inStackOrder, int[] popStackOrder) {
        Stack<Integer> stack = new Stack<>();
        if (inStackOrder == null || popStackOrder == null) {
            return false;
        }
        int inIndex = 0;
        int popIndex = 0;

        while (inStackOrder[inIndex] != popStackOrder[popIndex] && inIndex < inStackOrder.length - 1) {
            stack.push(inStackOrder[inIndex]);
            inIndex++;
        }

        while (popIndex < popStackOrder.length) {
            if (inStackOrder[inIndex] == popStackOrder[popIndex] || (!stack.isEmpty() && stack.peek() == popStackOrder[popIndex])) {
                if (inStackOrder[inIndex] == popStackOrder[popIndex]) {
                    if (inIndex < inStackOrder.length - 1) {
                        inIndex++;
                    }
                } else {
                    stack.pop();
                }
            }
            popIndex++;
        }


        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isPopOrder(new int[]{1, 2, 3, 4, 5}, new int[]{10,11,12}));
    }
}
