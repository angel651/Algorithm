package 队列;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/
 *
 * @author boyas
 * @create 2021/6/25 19:24
 */
//准备2个栈:inStack,outStack
//入队时，push到inStack中
//出队时
//如果outStack为空，将inStack所有元素逐一弹出，push到outStack,outStack弹出栈顶元素
//如果outStack不为空，outStack弹出栈顶元素
public class _232_用栈实现队列 {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    /**
     * Initialize your data structure here.
     */
    public _232_用栈实现队列() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        inStack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        checkOutStack();
        return outStack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        checkOutStack();
        return outStack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void checkOutStack() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }
}
