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
    private double tip;
    private double tax;

    public static final double FOOD_TAX = .09;

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
        { serviceQuality = EXCELLENT_SERVICE;
        }
        else if (serviceQuality < 0)  
        {
            serviceQuality = POOR_SERVICE;
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
        if( costOfMeal < 0)
        { costOfMeal = 0;
        }
        return costOfMeal;
    }

    /**
     *  Gets the amount of the tip as a percentage of the costOfMeal according to the quality of service level
     *  @return the tip
     */
    public double tip()
    {
        if(qualityOfService() == EXCELLENT_SERVICE)
        {
            tip =  costOfMeal * 0.25;
        }

        else if(qualityOfService() == GOOD_SERVICE)
        {
            tip =  costOfMeal * 0.20;
        }

        else if(qualityOfService() == FAIR_SERVICE)
        {
            tip = costOfMeal * 0.10;
        }

        else if(qualityOfService() == POOR_SERVICE)
        {
            tip = costOfMeal * 0.05;
        }

        return tip;
    }

        /**
     *@return returns the tax value
     */
 
    public double tax()
    {
        tax = costOfMeal() * FOOD_TAX;
        return tax;
    }

     /**
     * totalCost method 
     *@return total cost 
     */
    public double totalCost()
    {
        double totalCost = costOfMeal() + tip() + tax();
        return totalCost;
    }
}
