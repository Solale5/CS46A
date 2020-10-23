/**
 * Tester for the Wildebeest class
 */
public class WildebeestTester
{
    public static void main(String[] args)
    {
        Wildebeest beest = new Wildebeest();
        System.out.println("state: " + beest.getState());
        System.out.println("Expected: 4");
        
        beest.travel();
        System.out.println("state: " + beest.getState()
            + " " + beest.getHungerLevel());
        System.out.println("Expected: 4 null");
        
        beest.seeFood();
        System.out.println("state: " + beest.getState()
            + " " + beest.getHungerLevel());
        System.out.println("Expected: 4 null");
        
        beest.seeFood();
        System.out.println("state: " + beest.getState()
            + " " + beest.getHungerLevel());
        System.out.println("Expected: 4 null");      

    }
}