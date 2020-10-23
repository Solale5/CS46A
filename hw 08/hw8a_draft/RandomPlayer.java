import java.util.Random;
/**
 * Write a description of class RandomPlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomPlayer
{
    private int loopCounter = 0;
    private Random generator1 = new Random();
    private int value = 0;
    private int iterations;
    private int upperBound1;
    int firstLetter = 0;

    
    /**
     * Constructor for objects of class RandomPlayer
     * @param generator is the generator
     * @param upperBound is the upperBound
     * @param numberOfIterations is the iterations
     */
    public RandomPlayer(Random generator, int upperBound, int numberOfIterations)
    {
        generator1 = generator;
        iterations = numberOfIterations;
        this.upperBound1 = upperBound;

        
        
    }
    /**
     * @return gets the avg
     */
    public double average()
    {
        // double theAverage = value / loopCounter;

        // return theAverage  ;
        boolean first = true;
        for(int i =0; i < iterations; i++)

        {
            if( first == true)
            {
                firstLetter =  generator1.nextInt( upperBound1  );
                value = value +  firstLetter;
                first = false;
            }
            else
            {
                loopCounter++;  

                value = value + generator1.nextInt(upperBound1  );

                ;
            }
        }

        return firstLetter; 

    }
    /**
     * @param numberOfIterations1 is the number Of Iterations
     */
    public void setIterations( int numberOfIterations1)
    {

        iterations = numberOfIterations1;
    }

}
