import java.util.ArrayList;
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

    /**
     * gets the max value in an ArrayList
     * @param numbers is the arraylist
     * @return max is the max value
     */
    public static double max(ArrayList<Integer> numbers)
    {
        if(numbers.size() == 0)
        {
            return  Integer.MIN_VALUE;
        }
        double max = numbers.get(0);
        for(double s: numbers)
        {
            if(s> max)
            {
                max = s;
            }

        }

        return max;
    }

    /**
     * @param list is the array list
     * @param target is the variable being tested for
     * @return twice is the max
     * 
     */
    public static boolean containsMultiple(String[] list, String target)
    {
        int targetCounter = 0;
        boolean twice = false;
        if(list.length == 0) 
        {
            twice = false;
        }
        for(int i = 0; i < list.length; i++)
        {
            if(list[i].equals(target))
            {
                targetCounter++;
            }
            if(targetCounter == 2)
            {
                twice = true;

            }
        }

        return twice;
    }

    /**
     * @param list is the array list
     * @param target is the variable being tested for
     * @return twice is the max
     * 
     */
    public static boolean containsMultiple(ArrayList<String> list, String target)
    {

        int targetCounter = 0;
        boolean twice = false;
        if(list.size() == 0) 
        {
            twice = false;
        }
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).equals(target))
            {
                targetCounter++;
            }
            if(targetCounter == 2)
            {
                twice = true;

            }
        }

        return twice;
    }

}
