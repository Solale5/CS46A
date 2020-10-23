import java.util.Arrays;

/**
 * An array that can grow and shrink
 */
public class GrowableArray
{
    private String[] contents;
    private int size;  //the number of elements actually in the array
    public static final int CAPACITY = 8;
    /**
     * constructor for GrowableArray
     */
    public GrowableArray()
    {
        this.contents = new String [CAPACITY];
        

    }

    /* Notice this is not Javadoc since the method is not part of the public interface
     * 
     * If the array is at capacity, doubles the size of the array by creating a new array that is twice 
     * as big,  copying the elements from the old array to the new array
     * and assigning the new array to the array reference (instance variable) 
     * 
     * (Note: the array is at capacity when the instance variable size equals the length of the array
     * 
     */
    private void growIfNeeded()
    {
        if( size == contents.length)
        {
            String[] bigger = Arrays.copyOf(contents, size * 2);
            contents = bigger;

        }
    }

    /**
     * adds the given string at the end of the partially filled array
     * @param toAdd is the string to add
     */
    public void add(String toAdd)
    {

        if(size < contents.length)
        {
            size++;
            contents[size -1 ] = toAdd;

        }
        if(size == CAPACITY)
        {
            growIfNeeded();

        }

    }

    //Can not just use Arrays.toString because we only want the elements 
    //in the partially filled array - not all the elements.
    @Override
    public String toString()
    {
        String s = "[";
        for (int i = 0; i < size; i++)
        {
            if (i != 0)
            {
                s = s +", ";
            }
            s = s + contents[i];
        }

        s = s + "]";
        return s;
    }

    /**
     * adds a string to a certain spot in the array'
     * @param toAdd is the string to add
     * @param index is where you want to add the string
     * 
     */
    public void add(String toAdd, int index)
    {
        growIfNeeded();
        if(size < contents.length)
        {
            size++;
            for(int i = size ; i > index; i--)
            {
                contents[i] = contents [i -1];

            }
            contents [index] = toAdd;

        }

    }

    /**
     * removes a string to a certain spot in the array'
     * 
     * @param index is where you want to remove the string
     * 
     */
    public void remove(int index)
    {
        if(index < size)

        {for(int i = index +1; i < contents.length; i++)
            {
                contents[i-1] = contents[i];

            }
            size--;
        }

    }

}