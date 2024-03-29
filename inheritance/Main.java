package inheritance;
// import inheritance.Box;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(6.0, 30, 2);
        Box box1 = new Box(box);
        Box box2 = new Box(5.0);
        Box box3 = new Box();

        System.out.println(box.l + " " + box.h + " " + box.w);
        System.out.println(box1.l + " " + box1.h + " " + box1.w);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);
        System.out.println(box3.l + " " + box3.h + " " + box3.w);
        
        BoxWeight boxWeight = new BoxWeight();
        System.out.println(boxWeight.l + " " + boxWeight.h + " " + boxWeight.w + " " + boxWeight.weight);

        BoxWeight boxWeight1 = new BoxWeight(5.0, 10, 2, 3);
        System.out.println(boxWeight1.l + " " + boxWeight1.h + " " + boxWeight1.w + " " + boxWeight1.weight);
    }
}
