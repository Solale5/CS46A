
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
     * @ param h is the height
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
     * @ param h is the height
     * @param color is the color
     */
    public CMYKRectangle(int x, int y, int w, int h, String color)
    {
        super(x, y, w, h);
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
     *  stub
     */
    public void setCmykColor(String newColor)
    {

    }

}
