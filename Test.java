package overRide;

/**
 * Created by Nadeem on 19-07-2017.
 */
public class Test
{
    public static void main(String args[])
    {
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getROI());
        System.out.println("ICICI Rate of Interest: "+i.getROI());
        System.out.println("AXIS Bank Rate of Interestt: "+a.getROI());


    }
}
