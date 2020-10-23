/**
 * Models a parallelagram in 2-d space
 */
public class Parallelogram implements GeometricShape
{
    private int width;
    private int height;

    /**
     * Constructor for objects of class Parallelogram
     * @param width the width of this parallelagram
     * @param height the height of this parallelogram
     */
    public Parallelogram(int width, int height)
    {
        this.width = width;
        this.height = height;
    }
    public double area()
    {
        double area = 0;
        area = height * width;
        return area;
        
    }
    
    /**
     * Gets the width of this Parallelogram
     * @return the width of the parallelogram
     */
    public int getWidth()
    {
        return width;
    }
    
    /**
     * Sets the width of the Parallelogram
     * @param newWidth the value of the new width
     */
    public void setWidth(int newWidth)
    {
        width = newWidth;
    }
    
    /**
     * Gets the height of this Parallelogram
     * @return the height of the parallelogram
     */
    public int getHeight()
    {
        return height;
    }
    
    /**
     * Sets the height of the Parallelogram
     * @param newHeight the value of the new height
     */
    public void setHeight(int newHeight)
    {
        height = newHeight;
    }
    
    
    
     
}