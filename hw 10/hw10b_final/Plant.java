
/**
 * Write a description of class Plant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Plant
{
    String plantName;
    double plantPrice;
    /**
     * Constructor for objects of class Plant
     * @param name is the name
     * @param price is the price
     */
    public Plant(String name, double price)
    {
        plantName = name;
        plantPrice = price;
    }

    /**
     * gets the name
     * @return plantName is the name
     */
    public String getName()
    {
        return this.plantName; 

    }

    /**
     * gets the price
     * @return plantPrice returns it
     */
    public double getPrice()
    {
        return this.plantPrice;

    }
    /**
     * gets the name
     * @param theName is the new name
     */
    public void setName(String theName)
    {
        this.plantName = theName; 

    }
    
    /**
     * sets a new price
     * @param newPrice is the new price
     */
    public void setPrice(double newPrice)
    {
        this.plantPrice = newPrice;

    }


}
