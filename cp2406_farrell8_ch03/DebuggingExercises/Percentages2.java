import java.util.Scanner;
public class Percentages2
{
    public static void main (String args[])
    {
        double num1, num2;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a double >>");
        num1 = kb.nextDouble();
        System.out.print("Enter another double >>");
        num2 = kb.nextDouble();
        computerPercent(num1, num2);
        computerPercent(num2, num1);
    }
    public static void computerPercent (double x, double y)
    {
        System.out.println(x + " is " + (x / y) * 100 + "percent of" + y);
    }
}