import java.util.ArrayList;
/**
 * Manages a collection of SimpleLine objects
 *
 * @author KOBrien
 */
public class SimpleLineManager
{
    ArrayList<SimpleLine> lines;
    /**
     * constructor for SimpleLineManager class 
     */
    public SimpleLineManager ()
    {

        lines = new ArrayList();
    }

    /**
     * translates to string
     * @return returns string
     */
    @Override
    public String toString()
    {
        return lines.toString();
    }

    /**
     * @param line adds to the arraylist
     */
    public void add(SimpleLine line)
    {
        lines.add(line );

    }

    /**
     * @param line is the line
     * @return lineLength gets the line length
     */
    private double getLength(SimpleLine line)
    {
        double distanceX = line.getX2()-line.getX1();
        double distanceY = line.getY2()-line.getY1();
        double lineLength = Math.sqrt(Math.pow(distanceX,2) + Math.pow(distanceY,2));
        return lineLength;
    }

    /**
     * @return getLength(shortest) gets the shortest line
     */
    public double shortest()
    {

        if(lines.size() == 0)
        {
            return 0;
        }

        SimpleLine shortest = lines.get(0);

        for(SimpleLine a: lines)
        {
            if(getLength(a)<getLength(shortest))

            {
                shortest = a;
            } 
        }
        return getLength(shortest);

    }

    /**
     * @param index1 is the index 1
     * @param index2 is the second index
     */
    public void swap(int index1, int index2)
    {
        if(index1 >= 0 && index2 >= 0 && index1 < lines.size() && index2 < lines.size())
        {
            SimpleLine indexOne = lines.get(index1);
            lines.set(index1, lines.get(index2));
            lines.set(index2, indexOne);
        }

    }
}
 