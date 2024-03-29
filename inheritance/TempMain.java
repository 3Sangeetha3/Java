package inheritance;

class Temperature{
    float celcius;
    float fahrenheit;
    void inputTemperature(float c)
    {
        celcius = c;
    }
}
class conversion extends Temperature{
    void convert()
    {
        fahrenheit = (celcius * 9/5) + 32;
    }
    void display()
    {
        System.out.println("Celcius: " + celcius);
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
public class TempMain {
    public static void main(String[] args) {
        conversion obj = new conversion();
        obj.inputTemperature(37);
        obj.convert();
        obj.display();
    }
    
}
