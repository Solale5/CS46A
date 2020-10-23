/**
 * Tester for LoopsAndMore.
 *
 */
public class LoopsAndMoreTester
{
    public static void main(String[] args)
    {
        LoopsAndMore loops = new LoopsAndMore();
        System.out.println(loops.sumEveryThird(36));
        System.out.println("Expected: 153");
        System.out.println(loops.sumEveryThird(21));
        System.out.println("Expected: 48");
        System.out.println(loops.sumEveryThird(3));
        System.out.println("Expected: 0");
        System.out.println(loops.sumEveryThird(-4));
        System.out.println("Expected: 0");
        
        System.out.println(loops.printJava(5) );
        System.out.println("Expected: Java Java Java Java Java");
        System.out.println(loops.printJava(1) );
        System.out.println("Expected: Java");
        System.out.println("No output: " + loops.printJava(-2) );
        System.out.println("Expected: ");
        
        System.out.println(loops.largestPowerOf2(5));
        System.out.println("Expected: 4");
        System.out.println(loops.largestPowerOf2(16));
        System.out.println("Expected: 8");
        System.out.println(loops.largestPowerOf2(2));
        System.out.println("Expected: 1");
        System.out.println(loops.largestPowerOf2(1));
        System.out.println("Expected: -1");
        System.out.println(loops.largestPowerOf2(-5));
        System.out.println("Expected: -1");
        
        
    }
}