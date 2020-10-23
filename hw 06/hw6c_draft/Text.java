
/**
 * Write a description of class Text here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Text
{
    private String text;

    /**
     * Constructor for objects of class Text
     * @param theText is the text
     */
    public Text(String theText)
    {
        text = theText;

    }

    /**
     * @return text returns the text
     */
    public String getText()
    {
        return text;
    }

    /**
     * Determines if the string is a single digit
     * @param ch the String to test
     * @return true if the string contains a single digit else false
     */
    public boolean isDigit(String ch)
    {
        if (ch.length() != 1)
        {
            return false;
        }
        else 
        {
            return Character.isDigit(ch.charAt(0));
        }
    }
    
    /**
     * gets the number of as in a text
     * @return count gets the number of a's
     */

    public int getACount() 
    {

        int count = 0;
        for (int a = 0;  a<text.length(); a++)
        {
            String text1 = this.text.substring(a, a+1);
            if (text1.equals("a") || text1.equals("A"))
            { 
                count++;
            }

        }
        
        
        return count;

    }
    /**
     * @param returns the digits of the string
     */
    public String getDigitsOnly() 
    {
         int i = 0;
         while( i<text.length())
         {
        if (isDigit(text.substring(i,i+1)))
        {
            return text.substring(i,i+1);
             i++;
            
        
        }
    }
     return text.substring(i,i+1);
    }
}
