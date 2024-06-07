package gr.aueb.cf.ch14.stackManager;

public class MainStackManager {

    public static void main(String[] args) {
        StackManager stackManager = StackManager.getInstance();
        stackManager.push("Coding");
        stackManager.push("Factory");
        System.out.println(stackManager.pop());
        System.out.println(stackManager.pop());
    }
}
