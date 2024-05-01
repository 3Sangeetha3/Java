package ARRAYS;

//Arrays of objects:

//2. By using a separate member method :

public class ArraysOfObjects1 {
    public static void main(String[] args)
    {
        Student1[] arr;
        arr = new Student1[2];

        arr[0] = new Student1();
        arr[1] = new Student1();

        arr[0].setData(1, "siya");
        arr[1].setData(2, "riya");

        System.out.println("Student data in student arr 0: ");
        arr[0].display();

        System.out.println("Student data in student arr 1: ");
        arr[1].display();
    }
}

class Student1{
    public int id;
    public String name;

    public void setData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Student id is: " + id + " " + "and student name is: " + name);
        System.out.println();
    }
}

