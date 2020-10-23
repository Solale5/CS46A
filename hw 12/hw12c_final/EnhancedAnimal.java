
/**
 * Write a description of class EnhancedAnimal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EnhancedAnimal extends Animal
{
    private int maxEnergy;

    /**
     * Constructor for objects of class EnhancedAnimal
     * @param limit is the limit of energy for an animal
     */
    public EnhancedAnimal(int limit)
    {

        maxEnergy = limit;
    }

    /**
     * animal eats
     * @param amountToEat is the quantity of food
     */
    public void eat(int amountToEat) 
    {
        if(amountToEat + super.getEnergy() < maxEnergy && amountToEat > 0)
        {
            super.eat(amountToEat);
        } 
        else if( amountToEat + super.getEnergy() >= maxEnergy)
        {
            super.eat(maxEnergy - super.getEnergy());
        }

    }

    /**
     * moves animal
     * @param amountToMove is how much the animal moves
     */
    public void move(int amountToMove)
    {

        if(amountToMove >= super.getEnergy() )
        {
            super.move(getEnergy());
        }
        else if(amountToMove > 0)
        {
            super.move(amountToMove);
        }
    }

}
