import java.util.ArrayList;
/**
 * Write a description of class AvengersList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AvengersList
{
    public static void main(String[] args)
    {
        ArrayList<String> avengers = new ArrayList();
        avengers.add("Captian America");
        avengers.add("Hulk");
        avengers.add("Iron Man");
        avengers.add("Thor");
        avengers.add(1 ,"Black Panther");
        avengers.set(2, "Black Widow");
        avengers.set(avengers.size()-2, "Hawkeye");
        avengers.remove("Thor");
        System.out.println(avengers.get(0) + "***");
        
       
        
        
        System.out.println(avengers);
        for (String theAvengers: avengers)
        {
            
            System.out.println(theAvengers);
            
            
            
            
        }
        
        

        
    }
}
