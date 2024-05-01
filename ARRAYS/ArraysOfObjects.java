package ARRAYS;

// Array of obejct
//syntax : Class_Name obj[ ] = new Class_Name[Array_Length];

//Different ways to initialize the array of objects:
    // 1. By using the constructors
    // 2. By using a separate member method

//1. By using the constructor:

public class ArraysOfObjects {
    
    public static void main(String[] args)
    {
        Student[] arr;
        arr = new Student[2];

        arr[0] = new Student(1, "siya");
        arr[1] = new Student(2, "riya");

        System.out.println("Student data in student arr 0: ");
        arr[0].display();

        System.out.println("Student data in student arr 1: ");
        arr[1].display();
    }
}

class Student {
    public int id;
    public String name;

    Student (int id,String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Student id is: " + id + " " + "and student name is: " + name);
        System.out.println();
    }
}

