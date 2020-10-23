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

        //test shortest
        System.out.println("Shortest: " + manager.shortest());
        System.out.println("Expected: SimpleLine[x1=0,y1=0,x2=30,y2=40]");

        //make a new one
        SimpleLine[] lines2 = {new SimpleLine(0, 0, 30, 40),
            new SimpleLine(20, 30, 90, 80),
            new SimpleLine(10, 20, 60, 70),
            new SimpleLine(15, 20, 80, 100),
            new SimpleLine(0, 0, 3, 4)
        };
        
        SimpleLineArrayManager manager2 = new SimpleLineArrayManager(lines2);       
        System.out.println("Shortest: " + manager2.shortest());
        System.out.println("Expected: SimpleLine[x1=0,y1=0,x2=3,y2=4]");
  
        //test swap
        manager2.swap(0, 3);
        System.out.println(manager2);
        System.out.println("Expected: [SimpleLine[x1=15,y1=20,x2=80,y2=100], SimpleLine[x1=20,y1=30,x2=90,y2=80], SimpleLine[x1=10,y1=20,x2=60,y2=70], SimpleLine[x1=0,y1=0,x2=30,y2=40], SimpleLine[x1=0,y1=0,x2=3,y2=4]]");
     
        //swap bad index. Should have no effect
        manager2.swap(-1, 1);
        manager2.swap(2, -1);
        manager2.swap(1, 5);
        manager2.swap(5, 2);
        System.out.println(manager2);
        System.out.println("Expected: [SimpleLine[x1=15,y1=20,x2=80,y2=100], SimpleLine[x1=20,y1=30,x2=90,y2=80], SimpleLine[x1=10,y1=20,x2=60,y2=70], SimpleLine[x1=0,y1=0,x2=30,y2=40], SimpleLine[x1=0,y1=0,x2=3,y2=4]]");

        //test with empty object
        manager = new SimpleLineArrayManager(new SimpleLine[0]);
        manager.swap(1, 3);
        System.out.println(manager);
        System.out.println("Expected: []");


        System.out.println("Shortest: " + manager.shortest());
        System.out.println("Expected: null"); 
 
    }
}