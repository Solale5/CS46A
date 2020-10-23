
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
         this.text = theText;

    }

    /**
     * @return text returns the text
     */
    public String getText()
    {
        return this.text;
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
     * gets the digits of the string
     * @return new1 rgets digits
     */

    public String getDigitsOnly() 
    {
        
        String new1 = "";
        for ( int a = 0; a<text.length(); a++)
        {
            
            if (isDigit(this.text.substring(a,a+1)))
            {
                new1 = new1 + this.text.substring(a,a+1);

            }

        }
        return new1;
    }
    /**
     * gets first letter
     * @return new1 gets the new 1
     */

    public String firsts()
    {
        if( this.text.length() <= 2)
        {
            return this.text;
        }
     String firsts = text.substring(0, 1);
        int indexOfSpace = text.indexOf(" ");
        while (indexOfSpace != -1)
        {
            firsts = firsts + text.substring(indexOfSpace + 1, indexOfSpace + 2);
             indexOfSpace = text.indexOf(" ", indexOfSpace + 1);
        }
       
        return firsts;
    
    }
}

