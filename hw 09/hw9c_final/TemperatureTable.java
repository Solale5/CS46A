import java.util.Arrays;
/**
 * Write a description of class TemperatureTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TemperatureTable
{
    // instance variables - replace the example below with your own
    private String nameOfCity;
    private int[][] temperature;

    /**
     * Constructor for objects of class TemperatureTable
     */
    public TemperatureTable(String theCity ,int[][] theTemperature )
    {
        this.nameOfCity = theCity;
        this.temperature = theTemperature;
    }

    /**
     * gets the value of the last place in the array
     * @return theLast returns it
     */
    public int last()
    {
        int lastR = temperature.length-1;
        int lastC = temperature[0].length-1;
        int theLast = temperature[lastR][lastC];
        return theLast;
    }

    /**
     * gets the name of city
     * @return nameOfCity is the name
     */
    public String getName() 
    {
        return this.nameOfCity;
    }

    public int getHighest()

    {
        int highest = temperature[0][0];
        for (int row = 0; row < temperature.length; row ++)
        {
            for (int column = 0; column < temperature[0].length; column++)
            {
                if(temperature[row][column] > highest)
                {
                    highest = temperature[row][column];
                }
            }
        }
        return highest;
    }

    /**
     * sees if the array has the target value
     * @param target is what you are testing for
     * @return contains is what the target contains
     */
    public boolean contains(int target)
    {
        boolean contains = false;
        for (int row = 0; row < temperature.length; row ++)
        {
            for (int column = 0; column < temperature[0].length; column++)
            {
                if(temperature[row][column] == target)
                {
                    contains = true;
                }
            }
        }
        return contains;
    }
}
