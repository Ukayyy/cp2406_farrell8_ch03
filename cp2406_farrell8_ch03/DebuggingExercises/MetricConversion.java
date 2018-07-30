import java.util.Scanner;
public class MetricConversion
{
    public static void main (String args[])
    {
        int aValue;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer >>");
        aValue = input.nextInt();
        convertToCentimeters(aValue);
    }
    public static void convertToCentimeters(int inches)
    {
        double centimeters;
        final double CENT_FACTOR = 2.54;
        centimeters = inches * CENT_FACTOR;
        System.out.println(inches + " inches is " + centimeters + " centimeters");
    }
}
