//predefined classes in java are called as wrapper classes
public class WrapperClass {
     public static void main (String[] args){
        int x = Integer.parseInt("123"); // Integer is a class and parseInt is a static method
        // returns int type value
        Integer x1 = Integer.valueOf("10110", 2); // valueOf is a static method
        // returns object of Integer class
        int y = x1.intValue(); // x1 is object of Integer class and intValue is a method and non-static
        // returns int type value
        System.out.println(x);
        System.out.println(y);
    }
}