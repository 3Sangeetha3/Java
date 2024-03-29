package inheritance;

class Base
{
    Base()
    {
        System.out.println("Base class constructor");
    }
}

class Derived extends Base
{
    Derived()
    {
        System.out.println("Derived class constructor");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        System.out.println("Inside Inheritance1 main method");
        @SuppressWarnings("unused")
        Derived d = new Derived();
    }
}
