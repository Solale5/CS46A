
/**
 * Write a description of class Wildebeest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wildebeest
{
    public static final int NOT_HUNGRY = 5;
    public static final int SOMEWHAT_HUNGRY = 2;
    public static final int HUNGRY = 1;
    public static final int VERY_HUNGRY = 4;
    int hungerLevel=0;

    /**
     * Constructor for objects of class Wildebeest
     */
    public Wildebeest()
    {
        hungerLevel = VERY_HUNGRY;
    }

    /**
     * gets hunger level
     * @return hungerLevel is the hunger level
     */
    public int getState() 
    {
        return hungerLevel;

    }

    /**
     * makes wildebeast travel
     */
    public void travel() 
    {

    }
    /**
     * sees food
     */
    public void seeFood()
    {

    }
    /**
     * gets the hunger level as a string
     * @return null is nothing
     */
    public String getHungerLevel()
    {
        return null;
    }

    
}
