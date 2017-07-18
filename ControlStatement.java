/**
 * Created by Kajal on 15-07-2017.
 */
import java.util.Scanner;
public class ControlStatement {
    public static void main(String[] args)
    {
        int age;
        Scanner inputDevice= new Scanner(System.in);
        System.out.println("Please enter Age: ");
        age=inputDevice.nextInt();
        if(age>=18 && age<=35)
            System.out.println("Between 18-35");
        else if(age>35 && age<70)
            System.out.println("Between 35-70");
        else
            System.out.println("Not matched");
    }
}
