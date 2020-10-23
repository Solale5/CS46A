
/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Food extends Product
{
    private int totalCalories;
    private int caloriesFromFat;
    

    /**
     * Constructor for objects of class Food
     */
    public Food(String description, double price, int totalCalories, int caloriesFromFat)
    {
        super(description, price);
        this.totalCalories = totalCalories;
        this.caloriesFromFat = caloriesFromFat;
    }
    
    /**
     * gets total calories
     * @return totalCalories is the total calories
     */
    public int getCalories()
    {
        return totalCalories;
    }
    
    /**
     * gets calories from fat
     * @return caloriesFromFat is the calories from fat
     */
    public int getCaloriesFromFat()
    {
        
        return caloriesFromFat;
    }
    
    /**
     * tells us if the food is allowed on the diet
     * @return 0 cuz its a stub
     */
    public boolean isAllowed()
    {
        return false;
    }

    
}
