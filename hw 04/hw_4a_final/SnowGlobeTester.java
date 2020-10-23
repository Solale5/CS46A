/**
 * A tester for the SnowGlobe class
 * @author Kathleen O'Brien
 */
public class SnowGlobeTester
{
    public static void main(String[] args)
    {
        SnowGlobe globe = new SnowGlobe();
        System.out.println(globe.getVolume());
        System.out.println("Expected: 4188.790204786391");
        System.out.println(globe.getSnowVolume());
        System.out.println("Expected: 837.7580409572782");
        System.out.println(globe.getSnowCost());
        System.out.println("Expected: 1047.1975511965977");
        
        globe.setRadius(1.0);
        System.out.println(globe.getVolume());
        System.out.println("Expected: 4.1887902047863905");
        System.out.println(globe.getSnowVolume());
        System.out.println("Expected: 0.8377580409572781");
        System.out.println(globe.getSnowCost());
        System.out.println("Expected: 1.0471975511965976");
        
        globe = new SnowGlobe(5);
        System.out.println(globe.getVolume());
        System.out.println("Expected: 523.5987755982989");
        System.out.println(globe.getSnowVolume());
        System.out.println("Expected: 104.71975511965978");
        System.out.println(globe.getSnowCost());
        System.out.println("Expected: 130.89969389957471");
        
        
        
        
        
    }
}