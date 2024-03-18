//static functions 
class Functions{
    static void fun1(){
        System.out.println("This is fun1");
    }
    static void fun2(){
        System.out.println("This is fun2");
    }
}
public class StaticFunction {
    static void fun1(){
        System.out.println("This is fun1 - inside main");
    }
    static void fun2(){
        System.out.println("This is fun2 - inside main");
    }
    public static void main(String[] args) {
        fun1();
        fun2();
        Functions.fun1();
        Functions.fun2();
    }
}
