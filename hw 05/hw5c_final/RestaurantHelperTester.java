public class RestaurantHelperTester
{
    public static void main(String[] args)
    {
        RestaurantHelper helper = new RestaurantHelper(100.0, RestaurantHelper.EXCELLENT_SERVICE);
        System.out.printf("Excellent tip: $%.2f%n", helper.tip());
        System.out.println("Expected: $25.00");
        System.out.printf("Tax:  $%.2f%n", helper.tax());
        System.out.println("Expected: $9.00");
        System.out.printf("Total:  $%.2f%n", helper.totalCost());
        System.out.println("Expected: $134.00");
        
        helper = new RestaurantHelper(20.0, RestaurantHelper.GOOD_SERVICE);
        System.out.printf("Good: $%.2f $%.2f%n",helper.tip(), helper.totalCost());
        System.out.println("Expected: $4.00 $25.80");
        
        helper = new RestaurantHelper(51.40, RestaurantHelper.FAIR_SERVICE);
        System.out.printf("Fair: %.2f %.2f%n",helper.tip(), helper.totalCost());
        System.out.println("Expected: 5.14 61.17");
        
        helper = new RestaurantHelper(100.0, RestaurantHelper.POOR_SERVICE);
        System.out.printf("Poor: %.2f %.2f%n",helper.tip(), helper.totalCost());
        System.out.println("Expected: 5.00 114.0");
    }
}