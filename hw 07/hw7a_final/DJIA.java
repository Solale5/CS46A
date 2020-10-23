import java.util.Scanner;
/**
 * Write a description of class DJIA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DJIA
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        double priceOfDay=0;
        int numberOfDecreasedDays = 0;
        double largestValue = 0 ;
        int days = 0;
        boolean first = true;
        double sum = 0;
        double average = 0;
        System.out.print("Enter the change for the day or Q to quit: ");

        if(scan.hasNextDouble()== false )
        {
            System.out.println("No values entered");
        }
        while (scan.hasNextDouble())
        {

            priceOfDay = scan.nextDouble();

            if (first == true)
            {
                largestValue = priceOfDay;
                first = false;

            }
            sum = sum + priceOfDay;
            days++;

            if(priceOfDay > largestValue)
            {
                largestValue = priceOfDay;

            }

            if(priceOfDay < 0)
            {
                numberOfDecreasedDays++;

            }
            System.out.print("Enter net income or Q to quit: ");

        }
        if(days >0 )
        {

            System.out.println( numberOfDecreasedDays);

            System.out.println(largestValue);

            average = sum/days;
            System.out.println(average);


        }
    }
}
