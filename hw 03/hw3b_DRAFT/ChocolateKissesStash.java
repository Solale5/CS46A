/**
 * Constructs a simulation of a box of Hershey's Kisses.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChocolateKissesStash
{
    // instance variables - replace the example below with your own
    private int maxCapacity;
    private int currentAmount;

    /**
     * Constructor for objects of class ChocolateKissesStash
     * 
     * @param theMaxCapacity shows capacity of box
     * 
     */
    public ChocolateKissesStash(int theMaxCapacity)
    {
        // initialise instance variables
        maxCapacity = theMaxCapacity;
        //currentAmount = theCurrentAmount;
    }

    /**
     * Gets the box capacity
     *
     * 
     * @return  the max capacity of the box
     */
    public int getMaxCapacity()
    {
        return maxCapacity;
        
    }
    /**
     * this method shows current 
     *
     * @return the current amount int the box
     */
    public int getCurrentAmount()
    {
        return currentAmount;
        
    }
    /** 
     * simulates eating a certain number of kisses
     * 
     * @param amountToEat how much they ate
     */
    public void eat(int amountToEat)
    {
    }
    /** 
     * Buys more because you ate them all
     * 
     * @param amountToBuy how much you buy
     */
    public void buyMore(int amountToBuy)
    {
    }
}