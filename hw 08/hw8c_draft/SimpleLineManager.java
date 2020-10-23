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
}