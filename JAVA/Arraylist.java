package JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        
        ArrayList<Integer> list = new ArrayList<>(); // this is an array that doesn't need a fied size

        //u can just add elements as may as u want
        list.add(20);
        list.add(10);
        
        //System.out.print("Enter numbers: ");
        //while (scanner.hasNextInt()){
            //list.add(scanner.nextInt());
        //}

        // for the size, u use arrayname.size(), and to access it, u use arrayname.get(index)
        for (int i = 0; i < list.size(); i++){
            System.out.println("[" + i + "] - " + list.get(i));
        }

        for (int num : list){
            System.out.print(num + " ");
        }

        System.out.println();
        list.forEach(System.out::println);

        //check if list is empty, boolean
        System.out.println(list.isEmpty());
        System.out.println(list.contains(0)); // check if list contains the input

        //updating an element (list.add(index, element))
        list.add(0, 100);

        list.remove(1);

        list.clear();

        list.add(192);
        list.add(200);

        for (int num : list){
            System.out.print(num + " ");
        }

        System.out.println();
        Collections.sort(list); //sort in ascending
        for (int num : list){
            System.out.print(num + " ");
        }
        System.out.println();

        Collections.sort(list, Collections.reverseOrder()); // descending
        for (int num : list){
            System.out.print(num + " ");
        }
        System.out.println();

        ArrayList<Integer> copy = new ArrayList<>(list); //copying arraylist

        for (int n : copy){
            System.out.println(n);
        }

        Integer[] arr = {1,2,3}; 
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr)); //converting array to arraylist
        Integer[] array = list2.toArray(new Integer[0]); // arraylist to array

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Liam"));
        students.add(new Student("Ben"));

        for(Student s : students){
            System.out.println(s.name);
            }
            
        }

    }

    class Student{
    String name;

    Student(String name){
        this.name = name;
    }
}

