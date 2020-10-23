/**
 * Tests the LineManager class.
 *
 * @author Kathleen O'Brien
 */
public class SimpleLineArrayManagerTester
{
    public static void main(String[] args)
    {
        SimpleLine[] lines = {new SimpleLine(0, 0, 30, 40),
            new SimpleLine(20, 30, 90, 100),
            new SimpleLine(10, 20, 60, 70),
            new SimpleLine(15, 20, 80, 100)
        };
            
        SimpleLineArrayManager manager = new SimpleLineArrayManager(lines);

        //test sum
        System.out.printf("Sum: %.2f%n" , manager.sum());
        System.out.println("Expected: 322.78");

        //make a new one
        SimpleLine[] lines2 = {new SimpleLine(0, 0, 30, 40),
            new SimpleLine(20, 30, 90, 80),
            new SimpleLine(10, 20, 60, 70),
            new SimpleLine(15, 20, 80, 100),
            new SimpleLine(0, 0, 3, 4)
        };
        
        SimpleLineArrayManager manager2 = new SimpleLineArrayManager(lines2);       
        
        System.out.printf("Sum: %.2f%n" , manager2.sum());
        System.out.println("Expected: 314.81");
 
    }
}