/**
 * constructs a class that can make snowglobes
 * @author Solomon Alemu
 */
public class SnowGlobe
{
    // instance variables 
    private double radius;
     
    
    /**
     * consructor that sets the radius = 10
     */
    public SnowGlobe()
    {
        //set the original radius value
        radius = 10.0;
    }

    
    /**
     *  the setRadius method allows for the radius to be set
     *  @param newRadius the new radius floating point number
     */
      public void setRadius(double newRadius)
    {
        radius = newRadius;
    }
    
    /**
     * @return this method returns the radius of the SnowGlobe
     */
    public double getRadius()
    {
        return radius;
    }    
    
}
    
    
    
   