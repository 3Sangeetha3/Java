//Static members
class A{
    private int x;
    private static int y;
    void fun1(){
        y=2;
        x=5;
    }
    void fun2(){
        System.out.println(y);
        System.out.println(x);
    }
    void fun3(){
        y=3;
    }
}
public class ClassObject1 {
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A();
        a1.fun1(); // y = 2
        a2.fun3(); // y = 3
        a1.fun2(); // y = 3 and x = 5
        a2.fun2(); // y = 3 and x = 0

        // static members are shared by all objects of the class and are created only once
    }
}
