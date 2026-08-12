package DSA;

import java.util.Scanner;

public class Stacks {
    
    static class Stack{
        private static int maxSize = 5;
        private int[] data;
        private int top;

        public Stack(){
            data = new int[maxSize]; // creates array
            top = -1; // initialize top
        }

        public void push(int element){
            if (top == maxSize - 1){ // 5 - 1 = 4, if 4 = top, meaning it's full
                System.out.println("Stack Overflow");
                return;
            }

            data[++top] = element;

        } 

        public int pop(){
            if (top == -1){
                System.out.println("Stack Underflow");
                return -1;
            }

            return data[top--];
        }

        public int peek(){
            if (top == -1){
                System.out.println("Stack Underflow");
                return -1;
            }

            return data[top];
        }

        public void printStack(){
            if (top == -1){
                System.out.println("Stack Empty");
                return;
            }

            for (int i = top; i >= 0; i--){
                if (i == top){
                    System.out.println("[" + data[i] + "] - TOP");
                    System.out.println(" |");
                    System.out.println(" v");
                }

                else{
                    System.out.println("[" + data[i] + "]");
                        if (i != 0) {
                            System.out.println(" |");
                            System.out.println(" v");
                        }
                }

           }
        }
    }

    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        Stack stack = new Stack();
        while(true){
            System.out.println("MENU");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEK");
            System.out.println("4. PRINT LIST");
            System.out.print("CHOOSE STACK COMMAND: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    System.out.print("ENTER ELEMENT: ");
                    int elem = Integer.parseInt(scanner.nextLine());

                    stack.push(elem);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    System.out.println(stack.peek());
                    break;
                
                case 4:
                    stack.printStack();
                    break;
            }
        }
        
        //stack.push(18);
        //stack.push(45);
        //stack.pop();
        //System.out.println(stack.peek());

    }
}


