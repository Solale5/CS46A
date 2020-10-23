
public class SnowmanViewer
{
    public static void main(String[] args)
    { Rectangle hat = new Rectangle (50, 10, 20, 20);
      Line hatline = new Line (40, 30, 80, 30);
      hat.draw();
      hatline.draw();
      hat.setColor(new Color(0, 0, 0));
      hat.fill();

      
    }
}