/**
 * Tester for the Wildebeest class
 */
public class WildebeestTester
{
    public static void main(String[] args)
    {
        Wildebeest beest = new Wildebeest();
        System.out.println("state: " + beest.getState()
            + " " + beest.getHungerLevel());
        System.out.println("Expected: 4 Very hungry");
        
        beest.travel();
        System.out.println("state: " + beest.getState()
            + " " + beest.getHungerLevel());
        System.out.println("Expected: 4 Very hungry");
        
        beest.seeFood();
        System.out.println("state: " + beest.getState()
            + " " + beest.getHungerLevel());
        System.out.println("Expected: 1 Hungry");
        
        beest.seeFood();
        System.out.println("state: " + beest.getState()
            + " " + beest.getHungerLevel());
        System.out.println("Expected: 2 Somewhat hungry");
        
        beest.seeFood();
        System.out.println("state: " + beest.getState()
            + " " + beest.getHungerLevel());
        System.out.println("Expected: 5 Not hungry");
        
        beest.seeFood();
        System.out.println("state: " + beest.getState()
            + " " + beest.getHungerLevel());
        System.out.println("Expected: 5 Not hungry");
        
        beest.travel();
        System.out.println("state: " + beest.getState()
            + " " + beest.getHungerLevel());
        System.out.println("Expected: 2 Somewhat hungry");
        
        beest.travel();
        System.out.println("state: " + beest.getState()
            + " " + beest.getHungerLevel());
        System.out.println("Expected: 1 Hungry");
        
        beest.travel();
        System.out.println("state: " + beest.getState()
            + " " + beest.getHungerLevel());
        System.out.println("Expected: 4  Very hungry");
        
        beest.travel();
        System.out.println("state: " + beest.getState());
        System.out.println("Expected: 4");
                
    }
}