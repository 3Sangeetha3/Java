public class ex1 {
    public static void main(String args[])
    {
        float x = Float.parseFloat(args[0]);
        float y = Float.parseFloat(args[1]);
        
        float z = 0.001f;
        if(x-y<z || y-x<z)
        {
            System.err.println("Numbers are same");
        }
        else{
            System.out.println("Numbers are not same till 3 decimal places");
        }
    }
}
