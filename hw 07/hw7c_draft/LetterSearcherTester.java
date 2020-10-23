/**
 * Tests the CharacterSearch class.
 * 
 */
public class LetterSearcherTester
{
   public static void main(String[] args)
   {
       LetterSearcher search = new LetterSearcher("x");
       System.out.println(search.getLetter() + " " + search.letterCount("zero"));
       System.out.println("Expected: x 0");

       System.out.println(search.getLetter() + " " + search.letterCount("Xerox"));
       System.out.println("Expected: x 0");
       
       search = new LetterSearcher("s");      
       System.out.println("double at index: " + search.doubleIndex("Mississippi"));
       System.out.println("Expected: 0");       

       search = new LetterSearcher("a");
       System.out.println("double at index: " + search.doubleIndex("apple"));
       System.out.println("Expected: 0");       
   }
}