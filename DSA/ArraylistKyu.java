package DSA;

import java.util.ArrayList;

public class ArraylistKyu {
    
    static class Q{
        private ArrayList<Integer> q = new ArrayList<>();
        private int front;
        private int rear;

        public Q(){
            front = 0;
            rear = -1;
        }

        public void enqueue(int element){
            ++rear;
            q.add(rear, element);
        }

        public int dequeue(){
            if (q.size() == 0){
                System.out.println("ArrayList is empty!");
                return -1;
            }
            rear--;
            return q.remove(front);
        }

        public int peek(){
            if (q.size() == 0){
                System.out.println("ArrayList is empty!");
                return -1;
            }
            return q.get(front);
        }
    }

    public static void main(String args[]){
        Q que = new Q();

        que.enqueue(20);
        System.out.println(que.peek());
    }
}
