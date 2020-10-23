/**
 * Tests the LineManager class.
 *
 * @author Kathleen O'Brien
 */
public class SimpleLineManagerTester
{
    public static void main(String[] args)
    {
        SimpleLineManager manager = new SimpleLineManager();
        manager.add(new SimpleLine(0, 0, 30, 40));   
        manager.add(new SimpleLine(20, 30, 90, 100)); 
        manager.add(new SimpleLine(10, 20, 60, 70));  
        manager.add(new SimpleLine(15, 20, 80, 100));  

        System.out.println(manager);
        System.out.println("Expected: [SimpleLine[x1=0,y1=0,x2=30,y2=40], SimpleLine[x1=20,y1=30,x2=90,y2=100], SimpleLine[x1=10,y1=20,x2=60,y2=70], SimpleLine[x1=15,y1=20,x2=80,y2=100]]");
        
        manager.add(new SimpleLine(0, 0, 3, 4));   
        System.out.println(manager.toString());
        System.out.println("Expected: [SimpleLine[x1=0,y1=0,x2=30,y2=40], SimpleLine[x1=20,y1=30,x2=90,y2=100], SimpleLine[x1=10,y1=20,x2=60,y2=70], SimpleLine[x1=15,y1=20,x2=80,y2=100], SimpleLine[x1=0,y1=0,x2=3,y2=4]]");
    }
}