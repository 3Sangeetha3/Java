package inheritance;
import inheritance.Box;

@SuppressWarnings("unused")
public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }

    BoxWeight(double l, double h, double w, double weight){
        super(l, h, w);  // calling the constructor of the parent class
        //used to initialize values present in parent class
        this.weight=weight;
    }
}
