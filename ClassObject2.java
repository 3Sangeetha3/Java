class Demo1
{
    private int a;
    private int b;
    void setValue()
    {
        a = 2;
        b = 3;
    }
    void getValue()
    {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
public class ClassObject2 {
    public static void main(String[] args){
        Demo1 obj = new Demo1();
        obj.getValue();
        obj.setValue();
        obj.getValue();
    }
}
