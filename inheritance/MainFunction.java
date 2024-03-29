package inheritance;
class Parameters{
    float length;
    float breadth;
    void parametersin(float l, float b)
    {
        length = l;
        breadth = b;
    }
}
class Area extends Parameters{
    float areaof;
    void displayArea()
    {
        areaof = length * breadth;
        String formattedArea = String.format("%.2f", areaof);
        System.out.println("Formatted area: " + formattedArea);
    }
}
public class MainFunction {
    public static void main(String[] args){
        Area a = new Area();
        a.parametersin(2, 3);
        a.displayArea();
    }
}
