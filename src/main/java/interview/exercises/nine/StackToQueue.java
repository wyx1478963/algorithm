package interview.exercises.nine;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的 Push 和 Pop 操作。队列中的元素为 int 类型
 */
public class StackToQueue {
    private static Stack<Integer> stack1 = new Stack<>();

    private static Stack<Integer> stack2 = new Stack<>();

    public static  void push(int i) {
        stack1.push(i);
    }

    public static int pop() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            if (stack2.isEmpty()) {
                return -1;
            }else {
                return stack2.pop();
            }
        }
    }


    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        push(4);
        push(5);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());

    }

}
