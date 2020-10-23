/**
 * constructs a class that can make snowglobes
 * @author Solomon Alemu
 */
public class SnowGlobe
{
    // instance variables 
    private double radius;
    public static final double PRICE_OF_WHITE_PARTICLES = 1.25;
    public static final double DEFAULT_RADIUS = 10.0;
    public static final double MAX_RADIUS = 50.0;

    /**
     * consructor that sets the radius = 10
     */
    public SnowGlobe()
    {
        //set the original radius value
        radius = DEFAULT_RADIUS;
        
    }

    /**
     *  constuctor that allows the radius to be set to a floating point number
     *  @param theRadius is the desired radius
     */
    public SnowGlobe(double theRadius)
    { radius = theRadius;
        if(theRadius <= 0)
        { 
            radius = DEFAULT_RADIUS;
        }

    }   

    /**
     *  the setRadius method allows for the radius to be set
     *  @param newRadius the new radius floating point number
     */
    public void setRadius(double newRadius)
    {
        radius = newRadius;
        if(newRadius <= 0)
        { 
            radius = DEFAULT_RADIUS;
        }
        if (newRadius > MAX_RADIUS)
        { 
            radius = MAX_RADIUS;
        }
    }

    /**
     * @return this method returns the radius of the SnowGlobe
     */
    public double getRadius()
    {
        return radius;
    }   

    /**
     * @return this method returns the volume of the snowglobe
     */
    public double getVolume()
    {
        double volume = Math.PI * (4.0/3.0) * radius * radius * radius;
        return volume;
    }

    /**
     * @return SnowVolume returns the volume of snow
     */

    public double getSnowVolume()
    {
        double snowVolume = getVolume() * 0.2;
        return snowVolume;
    }

    /**
     * yee
     * @return snowCost; returns Snow Cost
     */

    public double getSnowCost()
    {
        double snowCost = getSnowVolume()*PRICE_OF_WHITE_PARTICLES;
        return snowCost;
    }

}
