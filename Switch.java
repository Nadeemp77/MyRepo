/**
 * Created by Kajal on 15-07-2017.
 */
import java.util.Scanner;
public class Switch {
    public static void main(String[] args)
    {
        int age;
        Scanner inputDevice=new Scanner(System.in);
        System.out.println("Please Enter age: ");
        age=inputDevice.nextInt();
        switch (age)
        {
            case 18:
                    System.out.println("Age 18");
                    break;
            case 19:
                System.out.println("Age 19");
            default:
                System.out.println("Not matched");
                break;
        }
    }
}
