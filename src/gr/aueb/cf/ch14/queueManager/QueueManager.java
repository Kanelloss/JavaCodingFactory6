package gr.aueb.cf.ch14.queueManager;

public class QueueManager {
    private static final QueueManager INSTANCE = new QueueManager();
    private static final int MAX_SIZE = 100;    // typical size of the queue
    private int[] queue;
    private int pivot;

    private QueueManager() {
        queue = new int[MAX_SIZE];
        pivot = -1;
    }

    public static QueueManager getInstance() {
        return INSTANCE;
    }

    public void enqueue(int value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        queue[++pivot] = value;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int valuetoReturn = queue[0];
        pivot--;
        shiftQueueLeft();
        return valuetoReturn;
    }

    private void shiftQueueLeft() {
        for (int i = 0; i <= pivot; i++) {
            queue[i] = queue[i + 1];
        }
    }

    private boolean isFull() {
        return pivot == queue.length -1;
    }

    private boolean isEmpty() {
        return pivot == -1;
    }
}
