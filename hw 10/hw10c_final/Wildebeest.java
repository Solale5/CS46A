
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
     * gets hungerLevel level
     * @return hungerLevelLevel is the hungerLevel level
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

            if(hungerLevel == NOT_HUNGRY)
            {
                hungerLevel = SOMEWHAT_HUNGRY;
            }
            else if(hungerLevel == SOMEWHAT_HUNGRY)
            {
                hungerLevel = HUNGRY;
            }
            else if(hungerLevel == HUNGRY)
            {
                hungerLevel = VERY_HUNGRY;
            }
        
    }

    /**
     * sees food
     */
    public void seeFood()
    {
        if(hungerLevel != NOT_HUNGRY)
        {
            if(hungerLevel == SOMEWHAT_HUNGRY)
            {
                hungerLevel = NOT_HUNGRY;
            }
            if(hungerLevel == HUNGRY)
            {
                hungerLevel = SOMEWHAT_HUNGRY;
            }
            if(hungerLevel == VERY_HUNGRY)
            {
                hungerLevel = HUNGRY;
            }
        }


    }

    /**
     * gets the hungerLevel level as a string
     * @return null is nothing
     */
    public String getHungerLevel()
    {
        String hungerLevel1 = null;
        if(hungerLevel == HUNGRY)
        {
            hungerLevel1 = "Hungry";

        }
        else if(hungerLevel == 2)
        {
            hungerLevel1 = "Somewhat hungry";

        }
        else if(hungerLevel == 4)
        {
            hungerLevel1 = "Very hungry";

        }
        else if(hungerLevel == 5)
        {
            hungerLevel1 = "Not hungry";

        }
        return hungerLevel1;
    }

}
