public class Circle implements GeometricShape
{
    private int radius;

    /**
     * Constructor for objects of class Circle
     * @param r the radius of this circle
     */
    public Circle(int r)
    {
        // initialise instance variables
        radius = r;
    }
    
    public double area()
    {
        double area = 0;
        area = Math.PI * radius * radius;
        return area;
        
    }
    /**
     * Gets the radius of this Circle
     * @return the radius of this circle
     */
    public int getRadius()
    {
        return radius;
    }
    
    /**
     * Sets a new radius for this Circle
     * @param r the radius of this circle
     */
     public void setRadius(int r)
    {
        radius = r;
    }
   
}