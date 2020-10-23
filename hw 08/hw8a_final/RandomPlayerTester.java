import java.util.Random;
/**
 * Write a description of class RandomPlayerTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomPlayerTester
{
    public static void main(String[] args)
    {
        RandomPlayer random = new RandomPlayer(new Random(12345678), 10, 100);
        System.out.println("average: " + random.average()); 
        System.out.println("Expected: 4.95");
        System.out.println("above average: " + random.countGreaterThanMidValue()); 
        System.out.println("Expected: 34");
        System.out.println("count: " + random.count(5)); 
        System.out.println("Expected: 10");
        System.out.println("count: " + random.count(9)); 
        System.out.println("Expected: 8");
        
        random.setIterations(10);
        System.out.println("average: " + random.average());
        System.out.println("Expected: 4.8");
        System.out.println("above average: " + random.countGreaterThanMidValue()); 
        System.out.println("Expected: 3");
        
        random = new RandomPlayer(new Random(87654321), 100, 1000);
        System.out.println("average: " + random.average());
        System.out.println("Expected: 48.927");
        System.out.println("above average: " + random.countGreaterThanMidValue()); 
        System.out.println("Expected: 507");
        System.out.println("count: " + random.count(90)); 
        System.out.println("Expected: 11");
        
        random.setIterations(0);
        System.out.println("No iterations: " + random.average()); 
        System.out.println("Expected: 0.0");
    }
}