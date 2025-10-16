import java.util.*;

class Queue {
    int[] arr;
    int front, rear, size, capacity;
    public Queue(int n) {
        arr = new int[n];
        capacity = n;
        front = 0;
        rear = -1;
        size = 0;
    }
    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        arr[++rear] = x;
        size++;
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        size--;
    }
    public int getFront() {
        return isEmpty() ? -1 : arr[front];
    }
    public int getRear() {
        return isEmpty() ? -1 : arr[rear];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
}
class QueueCircular {
    int[] arr;
    int front, rear, size, capacity;

    public QueueCircular(int n) {
        arr = new int[n];
        capacity = n;
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        front = (front + 1) % capacity;
        size--;
    }

    public int getFront() {
        return isEmpty() ? -1 : arr[front];
    }

    public int getRear() {
        return isEmpty() ? -1 : arr[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}

public class Q57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Queue: ");
        int n = sc.nextInt();
        QueueCircular q = new QueueCircular(n);
        System.out.print("Enter number of queries: ");
        int queries = sc.nextInt();
        System.out.println("\nEnter your queries:");
        System.out.println("1 x -> enqueue(x)");
        System.out.println("2 -> dequeue()");
        System.out.println("3 -> getFront()");
        System.out.println("4 -> getRear()");
        System.out.println("5 -> isEmpty()");
        System.out.println("6 -> isFull()");
        System.out.println();

        for (int i = 0; i < queries; i++) {
            int type = sc.nextInt();

            switch (type) {
                case 1:
                    int x = sc.nextInt();
                    q.enqueue(x);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    System.out.println("Front: " + q.getFront());
                    break;
                case 4:
                    System.out.println("Rear: " + q.getRear());
                    break;
                case 5:
                    System.out.println("isEmpty: " + q.isEmpty());
                    break;
                case 6:
                    System.out.println("isFull: " + q.isFull());
                    break;
                default:
                    System.out.println("Invalid Query");
            }
        }
        sc.close();
    }
}