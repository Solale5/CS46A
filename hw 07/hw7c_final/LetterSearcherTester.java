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
       System.out.println("Expected: x 1");
       
       search = new LetterSearcher("s");
       System.out.println(search.getLetter() + " " + search.letterCount("Mississippi"));
       System.out.println("Expected: s 4");
       
       System.out.println("double at index: " + search.doubleIndex("Mississippi"));
       System.out.println("Expected: 2");
       
       search = new LetterSearcher("e");
       System.out.println("double at index: " + search.doubleIndex("tee-shirt"));
       System.out.println("Expected: 1");

       search = new LetterSearcher("a");
       System.out.println("double at index: " + search.doubleIndex("apple"));
       System.out.println("Expected: -1");
       
       System.out.println("double at index: " + search.doubleIndex("The appearance of the apple is red"));
       System.out.println("Expected: -1");
       
       search = new LetterSearcher("p");
       System.out.println("double at index: " + search.doubleIndex("The appearance of the apple is red"));
       System.out.println("Expected: 5");
   }
}