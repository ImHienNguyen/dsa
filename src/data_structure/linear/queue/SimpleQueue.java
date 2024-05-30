package data_structure.linear.queue;

public class SimpleQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());
    }


    public static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public static class Queue<T> {
        private Node<T> rear, front;
        private int size;

        public Queue() {
            front = rear = null;
            size = 0;
        }

        public void enqueue(T data) {
            Node<T> newNode = new Node<>(data);
            if (rear == null) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }

        public T dequeue() {
            T data;
            if (front == null) {
                data = null;
            } else {
                data = front.data;
                front = front.next;
                if (front == null) {
                    rear = null;
                }
            }
            size--;
            return data;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public T peek() {
            return front.data;
        }

        public int size() {
            return size;
        }
    }
}
