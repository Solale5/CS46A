
/**
 * Write a description of class Computer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Computer implements Comparable
{
    private String brand;
    private double ghz;
    /**
     * constructor for computer class
     * @param b is the brand
     * @param g is the clock speed
     */
    public Computer(String b, double g)
    {
        this.brand = b;
        this.ghz = g;
    }

    /**
     * gets clocks speed
     * @return ghz is the clock speed
     */
    public double getGhz()
    {
        return ghz;
    }

    /**
     * gets brand name
     * @return brand is the brand name
     */
    public String getBrand()
    {
        return brand;
    }
    
    /**
     * compares two objects
     * @param otherObject is the thing comparing
     * @return 0 is the stub
     */
    public int compareTo (Object otherObject)
    {
        Computer other = (Computer) otherObject;
       
         if(this.ghz == other.getGhz())
        {
            return brand.compareTo(other.getBrand());
            

        }
        else
        {
            return Double.compare(this.ghz, other.ghz);

        }

        
    }
    
    /**
     * Gets a string representation of the object
     * @return a string representation of the object
     */
    public String toString()
    {
        String s = getClass().getName()
                + "[brand=" + brand
                + ",gigahertz=" + ghz 
                + "]";
        return s;
    }
}

