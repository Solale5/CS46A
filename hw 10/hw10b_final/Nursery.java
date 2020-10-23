import java.util.ArrayList;
/**
 * Write a description of class Nursery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nursery
{
    private ArrayList<Plant> nursery;
    /**
     * constructor for nursery class
     */
    public Nursery()
    {
        nursery = new ArrayList<Plant>();
    }

    /**
     * gets all names of plants
     * @return names.toString() is the names
     */
    public String plantList()
    {
        ArrayList<String> names = new ArrayList<String>();
        for(Plant s: nursery)
        {
            names.add(s.getName());
        }
        return names.toString();
    }

    /**
     * adds to arrayList
     * @param p is the plant to be added
     */
    public void add(Plant p)
    {

        nursery.add(p);

    }

    /**
     * gets the average of the plants
     * @return total / counter is the average
     */
    public double average()
    {
        if(nursery.size() == 0)
        {
            return 0;
        }
        double total = 0;
        double counter = 0;
        for(int i = 0; i < nursery.size(); i++)
        {
            total = total + nursery.get(i).getPrice();
            counter++;
        }
        return total / counter;

    }

    /**
     * returns true if another nusery has the same plant names
     * @param otherNursery is the other nursery
     * @return same is the boolean that determines if its true or not
     */
    public boolean sameContents(Nursery otherNursery) 
    {
        if(nursery.size() != otherNursery.nursery.size())
        {
            return false;
        }
        boolean same = false;
        for( Plant s:  nursery )
        {
            for(Plant m: otherNursery.nursery)
            {
                if (s.getName().equals(m.getName()))
                {
                    same = true;
                }

            }

        }
        return same;

    }
}
