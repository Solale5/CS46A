/**
 *
 * @author Kathleen O'Brien 
 *  
 */
public class RestaurantHelper
{
    //put your constants here
    private double costOfMeal;
    private int qualityOfService;

    public static final int EXCELLENT_SERVICE = 3;
    public static final int GOOD_SERVICE = 2;
    public static final int FAIR_SERVICE = 1;
    public static final int POOR_SERVICE = 0;

    /**
     * constructor for the RestaurantHelper class
     * @param mealCost is the cost of the customers meal
     * @param serviceQuality is the customers rating for the service quality
     */
    public RestaurantHelper(double mealCost, int serviceQuality)
    {
        costOfMeal = mealCost;
        qualityOfService = serviceQuality;
        if(mealCost < 0)
        { mealCost = 0;
        }
        if (serviceQuality > 3)
        { serviceQuality = 3;
        }

    }

    /**
     *  Gets the quality of service
     *  @return the quality of the service
     */
    public int qualityOfService()
    {
        return qualityOfService;
    }

    /**
     * Gets the base cost of the meal (no tip or tax) 
     * @return the cost of the meal before tax and tip
     */
    public double costOfMeal()
    {
        return costOfMeal;
    }

}