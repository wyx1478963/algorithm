package interview.exercises.e30;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的 min 函数。
 */
public class MinStack {
    private static Stack<Integer> stack1;
    private static Stack<Integer> stack2;

    public static int getMin() {
        if (!stack2.empty()) {
            return stack2.peek();
        } else {
            return -1;
        }
    }

    public static int push(int val) {
        int value = stack1.push(val);
        if (stack2.isEmpty()) {
            stack2.push(val);
        } else if (stack2.peek() < val) {
            stack2.push(stack2.peek());
        } else {
            stack2.push(val);
        }
        return value;
    }

    public static int pop() {
        int value = stack1.pop();
        stack2.pop();

        return value;

    }
}
