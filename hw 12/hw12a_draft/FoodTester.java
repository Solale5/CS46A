/**
 * Test Food class
 */
public class FoodTester
{
    /**
     * Method main
     *
     * @param args A parameter
     */
    public static void main(String[] args)
    {
        Food pizza = new Food("Pizza Hut pepperoni pizza", 18.50, 380, 180);
        Food bread = new Food("Orowheat whole wheat bread", 4.00, 90, 10);
        Food soup = new Food("Hearty soup", 2.50, 150, 51);

        //you can always assign a subclass object to a 
        //superclass reference
        Product p = pizza;

        //be sure the old methods work
        bread.increasePrice(10.0);
        System.out.println(bread.getPrice());
        System.out.println("Expected: 4.4");
        bread.reducePrice(10);
        System.out.println(bread.getPrice());
        System.out.println("Expected: 3.96");

        //answers not necessarily correct
        //the method is a stub
        System.out.println(pizza.isAllowed());
        System.out.println("Expected: false");
        System.out.println(bread.isAllowed());
        System.out.println("Expected: false");

        //has not been overriden
        System.out.println(pizza.getDescription());
        System.out.println("Expected: Pizza Hut pepperoni pizza");
    }
}