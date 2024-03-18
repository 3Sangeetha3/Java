//non static functions 
class Functions{
    int a = 10; // non-static variable/ instance(object) member variable
    int b;
    void fun1()  // non-static function / instance(object) member function / method
    {
        System.out.println("This is fun1");
    }
    void fun2() // instance(object) member function
    {
        System.out.println("This is fun2");
    }
}
public class NonStaticFunction {
    void fun1(){
        System.out.println("This is fun1 inside the main class");
    }
    public static void main(String[] args) {
        // Functions.fun1(); // error because functions are non-static
        // Functions.fun2();
        // we need to create an object of Functions class to access the functions
        Functions obj = new Functions();
        obj.fun1();
        obj.fun2();
        System.out.println(obj.a);
        System.out.println(obj.b); // default value of b is 0


        NonStaticFunction obj2 = new NonStaticFunction();
        obj2.fun1();
    }
}
