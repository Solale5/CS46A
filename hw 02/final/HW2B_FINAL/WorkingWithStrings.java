
public class WorkingWithStrings
{
    public static void main(String[] args)
    {
        String word =  "sweethearT"; 
        System.out.println(word.toLowerCase());
        System.out.println(word.length());
        
        String tingy = word.replace("s", "$");
        System.out.println(tingy);
        String jiggy = tingy.replace("e", "3");
        System.out.println(jiggy);
        String tooly = jiggy.replace("a" , "4");
        System.out.println(tooly);
        System.out.println("original word: " + word);
        
        
      
    }
}