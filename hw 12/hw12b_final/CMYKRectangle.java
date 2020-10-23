
/**
 * Write a description of class CMYKRectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CMYKRectangle extends Rectangle
{
    private String cmykColor;
    /**
     * Constructor for objects of class CMYKRectangle
     * @param x is the x
     * @param y is the y
     * @param w is the width
     * @param h is the height
     */
    public CMYKRectangle(int x, int y, int w, int h)
    {
        super(x, y, w, h);
        cmykColor = "cyan";
        super.setColor(Color.CYAN);

    }

    /**
     * Constructor for objects of class CMYKRectangle
     * @param x is the x
     * @param y is the y
     * @param w is the width
     * @param h is the height
     * @param color is the color
     */
    public CMYKRectangle(int x, int y, int w, int h, String color)
    {
        super(x, y, w, h);
        

        setCmykColor(color);
        
        
        
    }

    /**
     * gets cmyk color
     * @return cmykColor is the color
     */
    public String getCmykColor()
    {
        return cmykColor; 
    }

    /**
     *  sets the color
     *  @param newColor is the new color
     */
    public void setCmykColor(String newColor)
    {
        if(newColor.equals("cyan"))
        {
            super.setColor(Color.CYAN);
            this.cmykColor = "cyan";
        }
        else if(newColor.equals("black"))
        {
            super.setColor(Color.BLACK); 
            cmykColor = "black";
        }
        else if(newColor.equals("yellow"))
        {
            super.setColor(Color.YELLOW); 
            cmykColor = "yellow";
        }
        else if(newColor.equals("magenta"))
        {
            super.setColor(Color.MAGENTA);
            cmykColor = "magenta";
        }
        else if(newColor != "cyan" || newColor != "magenta" ||newColor != "yellow"|| newColor != "black")
        {
            newColor = "cyan";
            cmykColor = "cyan";
            super.setColor(Color.CYAN);
        }

    }

    /**
     * does nothing
     * @param aColor is the color
     */
    public void setColor(Color aColor) 
    {

    }
}
