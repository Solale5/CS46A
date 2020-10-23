/**
 * Tests the class ChocolateKissesStash.
 *
 * @author Kathleen O'Brien
 */
public class ChocolateKissesStashTester
{
    public static void main(String[] args)
    {
        ChocolateKissesStash stash = new ChocolateKissesStash(-25);
        System.out.println("Capacity: " + stash.getMaxCapacity());
        System.out.println("Expected: 0");
        
        stash = new ChocolateKissesStash(50);
        System.out.println("Capacity: " + stash.getMaxCapacity());
        System.out.println("Expected: 50");
        
        
        stash.buyMore(100);
        System.out.println("Amount: " + stash.getCurrentAmount());
        System.out.println("Expected: 50");
        stash.buyMore(10);
        System.out.println("Amount: " + stash.getCurrentAmount());
        System.out.println("Expected: 50");
        stash.buyMore(-30);
        System.out.println("Amount: " + stash.getCurrentAmount());
        System.out.println("Expected: 50"); 
               
        stash.eat(-10);
        System.out.println("Amount: " + stash.getCurrentAmount());
        System.out.println("Expected: 50");
        stash.eat(15);
        System.out.println("Amount: " + stash.getCurrentAmount());
        System.out.println("Expected: 35");
        stash.eat(35);
        System.out.println("Amount: " + stash.getCurrentAmount());
        System.out.println("Expected: 0");
                
        stash = new ChocolateKissesStash(80);
        stash.buyMore(70);
        System.out.println("Amount: " + stash.getCurrentAmount());
        System.out.println("Expected: 70");
        stash.eat(5);
        System.out.println("Amount: " + stash.getCurrentAmount());
        System.out.println("Expected: 65");
        stash.eat(85);
        System.out.println("Amount: " + stash.getCurrentAmount());
        System.out.println("Expected: 0");
        stash.eat(19);
        System.out.println("Amount: " + stash.getCurrentAmount());
        System.out.println("Expected: 0");             
    }
}
