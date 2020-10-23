
/**
 * Write a description of class FramedPicture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FramedPicture
{
    
    private Picture pic;

    /**
     * Constructor for objects of class FramedPicture
     * @param thePicture is what picture you would like to use
     */
    public FramedPicture(Picture thePicture)
    {
        
         pic = thePicture;
    }
      /**
     * Gets the width of the image
     * @return the width of the image
     */
    public int getWidth()
    {
        return pic.getWidth();
    }

     /**
     * Gets the image with a round frame around
     * @return the image with a round frame around
     */
    public Picture frame()
    {
        
        for (int i = 0; i < getWidth(); i++)
        {
            pic.setColorAt(i, 0, Color.RED);
        }
        return pic;
    }
    
    
    
}
