
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

     
   /* public Picture frame()
    {
        double x = pic.getWidth();
        double y = pic.getHeight();
        double radius = Math.min(x,y) * 40/100;
        double centerX = pic.getWidth() / 2;
        double centerY = pic.getHeight() / 2;
        Ellipse frame = new Ellipse(centerX, centerY, radius,radius);
        
        for (int i = 0; i > pic.getWidth(); i++)
        {
            for(int j = 0; j>pic.getHeight(); j++)
            {
                
                if ((x - i)  > radius)
                {
                    pic.setColorAt(i, j, Color.RED);
            }
            
            
        }
        
    }
    return pic;
    
    
}*/
/**
     * Gets the image with a round frame around
     * @return the image with a round frame around
     */
public Picture frame()
    {
        int xPoint = getWidth()/2;
        int yPoint = pic.getHeight()/2;
        double s = pic.getWidth();
        double a = pic.getHeight();
         
        double radius = Math.min(s,a) * 40/100;
        for(int x = 0; x < pic.getWidth(); x++)
        {
            for (int y = 0; y<pic.getHeight();y++)
            {
                if (Math.sqrt(Math.pow(xPoint - x, 2) + Math.pow(yPoint - y, 2))>radius)
                {
                    pic.setColorAt(x, y, Color.BLACK);
                }
            }
            
        }
        return pic;
    }

}
