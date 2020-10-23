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

}
