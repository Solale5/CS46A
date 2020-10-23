/**
 * Tests the PrimaryRectangle class.
 */
public class CMYKRectangleViewer
{
    public static void main(String[] args)
    {
        //with default color
        CMYKRectangle r = new CMYKRectangle(10, 20, 20, 40);
        r.fill();      
        
        Text message = new Text(10, 70, r.getCmykColor());
        message.draw();
        
        r.setCmykColor("green"); //should have no effect
        message = new Text(10, 90, r.getCmykColor());
        message.draw();

    }
  
}