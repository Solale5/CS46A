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
        System.out.println(random.average());
        System.out.println("Expected: 3");
        
        random.setIterations(10);
        System.out.println(random.average());
        System.out.println("Expected: 2");
        
        random = new RandomPlayer(new Random(87654321), 100, 1000);
        System.out.println(random.average());
        System.out.println("Expected: 51");
    }
}