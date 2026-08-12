package DSA;

import java.util.ArrayList;

public class Arrayliststaks {

    static class Sta{
        private ArrayList<Integer> stck = new ArrayList<>();
        private int top;

        public Sta(){
            top = -1;
        }

        public void push(int element){
            top++;
            stck.add(top, element);
        }

        public int pop(){
            if (stck.size() == 0){
                System.out.println("Stack empty!");
                return -1;
            }

            top--;
            return stck.remove(top);
        }

        public int peek(){
            if (stck.size() == 0){
                System.out.println("Stack empty!");
                return -1;
            }

            return stck.get(top);
        }

        public void displayStack(){
            if (stck.size() == 0){
                System.out.println("Stack empty!");
            }

            for (int i = top; i > -1; i--){
                if (i == top){
                   System.out.println(stck.get(i) + " - TOP"); 
                }

                else {
                    System.out.println(stck.get(i));
                }
            }
        }
    }

    public static void main (String args[]){
        Sta stack = new Sta();

        stack.push(90);
        stack.push(20);
        stack.push(20);
        stack.push(50);
        stack.displayStack();


    }
    
}

