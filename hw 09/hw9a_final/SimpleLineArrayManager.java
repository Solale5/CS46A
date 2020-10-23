import java.util.Arrays;
/**
 * Manages a collection of SimpleLine objects
 *
 * @author KOBrien
 */

public class SimpleLineArrayManager
{
    private SimpleLine[] lines;

    /**
     * constructor for the class
     * @param theLine is the simple lines array
     */
    public SimpleLineArrayManager(SimpleLine[] theLine)
    {
        this.lines = theLine;
    }

    @Override
    public String toString()
    {
        return Arrays.toString(lines);
    }

    /**
     * gets the length of a line
     * @param line is the line
     * @return returns the length of the line
     */
    private double getLength(SimpleLine line)
    {
        double x1 = line.getX1();
        double x2 = line.getX2();
        double y1 = line.getY1();
        double y2 = line.getY2();
        double length = Math.sqrt(Math.pow(x2 - x1 ,2) + Math.pow(y2 - y1, 2 ));
        return length;
    }

    /**
     * goes through the line array and gets the length and adds it
     * @return theSum is the sum of the lines in the array
     */
    public double sum()
    {
        double theSum = 0;
        for(SimpleLine s: this.lines)
        {
            theSum += getLength(s);

        }
        return theSum;
    }

    /**
     * gets the shortest line
     * @return theShortest returns the shortest line
     */
    public SimpleLine shortest()
    {
        if(lines.length == 0)

        { return null;
        }
        SimpleLine shortest = lines[0];
        for(SimpleLine s: this.lines)
        {
            if(getLength(s) < getLength(shortest))
            {
                shortest = s;
            }

        }
        return shortest;
    }

    /**
     * it swaps two spots in the array
     * @param index1 is the spot to be swapped with index 2
     * @param index2 is the spot to be swapped with index 1
     * 
     */
    public void swap(int index1, int index2)
    {
        if( index1 >= 0 && index2 >= 0 && index1 < lines.length && index2 < lines.length)
        {
            SimpleLine spot1 = lines[index1];
            lines[index1] = lines[index2];
            lines[index2] = spot1;
        }

    }
}