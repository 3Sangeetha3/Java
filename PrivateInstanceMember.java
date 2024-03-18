//private Instance member
class demo {
    private static int x = 5;
    void fun(){
        System.out.println("Value of x is: "+x);
    }
    private static int y = 10;
    static void fun1(){
        System.out.println("Value of y is: "+y);
    }
}
public class PrivateInstanceMember {
    public static void main(String[] args){
        // accessing private instance member

        //creating object of class demo
        demo obj = new demo();
        obj.fun();

        //accessing private static member without creating object by using static method
        demo.fun1();

    }
}
