public class Percentages
{
    public static void main (String args[])
    {
        double num1 = 2.0, num2 = 5.0;
        computerPercent(num1, num2);
        computerPercent(num2, num1);
    }
    public static void computerPercent (double x, double y)
    {
        System.out.println(x + " is " + (x / y) * 100 + "percent of" + y);
    }
}
