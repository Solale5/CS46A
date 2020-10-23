
/**
 * Write a description of class Computer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Computer
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
}
