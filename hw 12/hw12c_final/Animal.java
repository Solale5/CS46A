
/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animal
{
    private int energy;
    /**
     * Constructor for objects of class Animal
     */
    public Animal()
    {
        energy = 1;
    }

    /**
     * animal eats
     * @param amountToEat is the quantity of food
     */
    public void eat(int amountToEat) 
    {
        energy += amountToEat;

    }

    /**
     * moves animal
     * @param amountToMove is how much the animal moves
     */
    public void move(int amountToMove)
    {
        energy -= amountToMove;
        
    }

    /**
     * gets the current energy
     * @return energy is the energy
     */
    public int getEnergy()
    {
        return energy;  
    }
}
