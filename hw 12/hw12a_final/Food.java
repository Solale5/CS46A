
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
    public Food(String description, double price, int Calories, int caloriesFromFat)
    {
        super(description, price);
        this.totalCalories = Calories;
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
     * @return true if it is allowed
     */
    public boolean isAllowed()
    {
        if(caloriesFromFat <= totalCalories / 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    } 

    
    /**
     * gets descriptipon
     * @return x is the new description
     */
    public String getDescription()
    {
        double calories = totalCalories; 
        double theCff = caloriesFromFat; 
        double percent = theCff/calories;
        String x = super.getDescription() + " %fat=" + String.format("%.1f", percent * 100);
        return x;
    }

}
