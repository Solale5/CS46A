/**
 * Write a description of class LoopsAndMore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopsAndMore
{  
    public int sumEveryThird(int limit)
    {
        int sum = 0;
        for (int x=0; x<limit; x+=3)
        {
            if (x%5 == 0)
            {
                x=x;
            }
            else 
            {
                sum = sum+x;
                
            }
        }
        return sum;
    }
    
    public String printJava(int count)
    {
        String words = " ";
        for(int y=1 ; y<=count; y++)
        {
            words = ("Java"+ " " + words );
        }
        return words;
    }
    
    public int largestPowerOf2(int target)
    {
        for (int x= 0; x<=target; x++)

        {
            if(Math.pow(2, x)<target && Math.pow(2, x+1)>= target)
            {
                return (int) Math.pow(2,x);

            }

            else if(!(Math.pow(2, x)<target))
            {
                return -1;

            }

        }
        return target;
    }
}