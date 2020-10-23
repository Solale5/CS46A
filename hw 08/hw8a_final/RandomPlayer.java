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
    private double value = 0;
    private int iterations;
    private int upperBound1;
    

    
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
     * @return theAverage gets the avg
     */
    public double average()
    {
        // double theAverage = value / loopCounter;

        // return theAverage;
        for(int i =0; i < iterations; i++)
        
        {
            value = value + generator1.nextInt(upperBound1  );
            loopCounter++;
            
            
            
            
            
            
        }
        // boolean first = true;
        // for(int i =0; i < iterations; i++)
        /*
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

        return firstLetter; */
        
        double theAverage = value / loopCounter;

         return theAverage;

    }
    /**
     * @param numberOfIterations1 is the number Of Iterations
     */
    public void setIterations( int numberOfIterations1)
    {

        iterations = numberOfIterations1;
        if(numberOfIterations1 == 0)
        {
            value = 0;
            
        }
    }
    /**
     * tests to see how many times the generator is equal to the entered value
     * @param value1 is the integer tested
     * @return count returns the count
     */
    public int count(int value1)
    {
        int count = 0;
        for (int i = 0; i < iterations; i++)
        { 
            if (generator1.nextInt(upperBound1) == value1)
            {
                count ++;
            }
        }
        return count;
    }
    /**
     * @return count returns the count
     */
    public int countGreaterThanMidValue()
    {
        int count = 0;
        for(int i = 0; i < iterations; i++)
        {
            if(generator1.nextInt(upperBound1) > upperBound1 / 2)
            {
                count++;
                
            }
            
            
        }
        
        return count;
        
    }
}


