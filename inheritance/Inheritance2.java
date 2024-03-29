package inheritance;
class Student{
    String name;
    int Subjects[] = new int[3];
    void inputStudentInfo(String name, int[] Subjects){
        this.name = name;
        this.Subjects = Subjects;
    }
}
class GardeCalculator extends Student{
    float avgGrade;
    void calculateAvgGrade(){
        int sum = 0;
        for(int i=0;i<3;i++){
            sum += Subjects[i];
        }
        avgGrade = sum/3;
        System.out.println("Average grade of "+name+" is "+avgGrade);
    }
}
public class Inheritance2{
    public static void main(String[] args){
        GardeCalculator student1 = new GardeCalculator();
        int[] subjects = {90, 80, 70};
        student1.inputStudentInfo("John", subjects);
        student1.calculateAvgGrade();
    }
}
