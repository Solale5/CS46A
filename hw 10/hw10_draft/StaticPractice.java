
/**
 * Write a description of class StaticPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StaticPractice
{
    /**
     * gets the max value in an array
     * @param numbers is the array
     * @return max is the max value
     */
    public static double max(int[] numbers)
    {
        if(numbers.length == 0)
        {
            return  Integer.MIN_VALUE;
        }
        double max = numbers[0];
        for(double s: numbers)
        {
            if (s>max)
            {
                max = s;

            }
        }

        return max;

    }

}
