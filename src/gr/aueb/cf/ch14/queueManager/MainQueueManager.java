package gr.aueb.cf.ch14.queueManager;

public class MainQueueManager {

    public static void main(String[] args) {

        QueueManager queueManager = QueueManager.getInstance();
        queueManager.enqueue(1);
        queueManager.enqueue(2);
        queueManager.enqueue(3);
        System.out.println(queueManager.dequeue());
        System.out.println(queueManager.dequeue());
        System.out.println(queueManager.dequeue());
    }
}
