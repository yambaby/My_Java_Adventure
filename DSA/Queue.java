package DSA;

public class Queue {
    
    static class Que{
        private int maxSize = 5;
        private int[] arr;
        private int front;
        private int rear;

        public Que(){
            arr = new int[maxSize];
            front = 0;
            rear = -1;
        }

        public void enqueue(int element){
            if (rear == maxSize - 1){
                System.out.println("Queue Overload!");
                return;
            }

            arr[++rear] = element;
        }

        public int dequeue(){
            if (front > rear){
                System.out.println("Queue Empty!");
                return -1;
            }

            return arr[front++];
        }

        public int peek(){
            if (front > rear){
                System.out.println("Queue Empty!");
                return -1;
            }

            return arr[front];

        }
        
    }

    public static void main(String[] args){
        Que queue = new Que();

        queue.enqueue(50);
        System.out.println(queue.peek());
    }
}
