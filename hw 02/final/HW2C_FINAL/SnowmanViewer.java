
public class SnowmanViewer
{
    public static void main(String[] args)
    { Rectangle hat = new Rectangle (50, 10, 20, 20);
      Line hatline = new Line (40, 30, 80, 30);
      hat.draw();
      hatline.draw();
      hat.setColor(new Color(0, 0, 0));
      hat.fill();
      Ellipse circle = new Ellipse (50, 30, 20, 20);
      circle.draw();
      Ellipse circle2 = new Ellipse (40, 50, 40, 40);
      circle2.draw();
      Ellipse circle3 = new Ellipse (30, 90, 60, 60);
      circle3.draw();


      
    }
}