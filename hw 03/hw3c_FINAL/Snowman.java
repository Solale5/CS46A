/**
 * constructs a class that can make snowman anywhere
 * @author Solomon Alemu
 */
public class Snowman
{
    //instance variables for the x and y coordinates
    private int x;
    private int y;
    
    /**
     * Constructor for the objects of the snowman class
     * @param theX the X cooridnate of the Snowman
     * @param theY the Y coordinate of the Snowman
     */
    public Snowman(int theX, int theY)
    { x = theX;
      y = theY;
    }
    /**
     * Draws the Hat and Brim 
     */
    public void draw()
    {
        Rectangle hatbox = new Rectangle(x, y, 20, 20);
        hatbox.fill();
        Rectangle brim = new Rectangle(x-10, y+20, 40, 0);
        brim.draw();
        Ellipse circle = new Ellipse (x, y+20, 20, 20);
        circle.draw();
        Ellipse circle2 = new Ellipse (x-10, y+40, 40, 40);
        circle2.draw();
        Ellipse circle3 = new Ellipse (x-20, y+80, 60, 60);
        circle3.draw();
        
    }
}
        