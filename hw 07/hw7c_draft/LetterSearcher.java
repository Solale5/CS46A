
/**
 * Write a description of class LetterSearcher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LetterSearcher
{

    private String letter;
    /**
     * Constructor for objects of class LetterSearcher
     * @param ch is the character
     */
    public LetterSearcher(String ch)
    {
        letter = ch;
        if (letter.length() > 1)
        {
            letter = letter.substring(0,1);

        }
    }

    /**
     * @param phrase is the entered phrase
     * @return count returns the count
     */
    public int letterCount(String phrase)
    {
        int count = 0;
        int a = 0;
        while(a < phrase.length())
        {

            if (phrase.substring(a,a+1)==letter)
            {

                count++;
                a++;

            }
            else
            {
                a++;

            }
        }

        return count;
    }

    /**
     * @param phrase is the ohrase
     * @return it returns nothing
     */

    public int doubleIndex(String phrase)
    {

        return 0; 

    }

    /**
     * 
     * @return it returns the first letter
     */
    public String getLetter()
    {

        return letter.substring (0,1);

    }

}
