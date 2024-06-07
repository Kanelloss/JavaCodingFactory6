package gr.aueb.cf.ch14.stackManager;

public class StackManager {

    private static final StackManager INSTANCE = new StackManager();
    private static final int MAX_SIZE = 100;        // typical size of the stack
    private String[] stack;
    private int top;

    private StackManager() {
        stack = new String[MAX_SIZE];
        top = -1;
    }

    public static StackManager getInstance() {
        return INSTANCE;
    }

    public void push(String str) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        stack[++top] = str;
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }

    private static boolean isFull() {
        return getInstance().top == MAX_SIZE -1;
    }

    private static boolean isEmpty() {
        return getInstance().top == -1;
    }




}
