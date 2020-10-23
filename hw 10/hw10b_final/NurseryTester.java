import java.util.ArrayList;
/**
 * Tester for Nursery
 */
public class NurseryTester
{
    public static void main(String[] args)
    {
        Nursery plants = new Nursery();
        
        //test empty list
        System.out.printf("%.2f%n",plants.average());
        System.out.println("Expected: 0.00");
        
        //add some plants
        plants.add(new Plant("dwarf maple tree", 121.75));
        plants.add(new Plant("blue star creeper flat", 15.95));
        plants.add(new Plant("marigold jumbo pack", 6.20));
        plants.add(new Plant("tomato plant", 4.50));
        plants.add(new Plant("lemon cucumber", 4.50));
        
        System.out.println(plants.plantList());
        System.out.println("Expected: [dwarf maple tree, blue star creeper flat, " 
          + "marigold jumbo pack, tomato plant, lemon cucumber]");
        
        System.out.printf("%.2f%n",plants.average());
        System.out.println("Expected: 30.58");
         
        plants.add(new Plant("California poppy 6-pack", 6.00));
        
        System.out.println(plants.plantList());
        System.out.println("Expected: [dwarf maple tree, blue star creeper flat, " 
          + "marigold jumbo pack, tomato plant, lemon cucumber, California poppy 6-pack]");
        
        System.out.printf("%.2f%n",plants.average());
        System.out.println("Expected: 26.48");
        
        //test same contents    
        Nursery other = new Nursery();
        
        System.out.println(plants.sameContents(other));
        System.out.println("Expected: false");
        System.out.println(other.sameContents(plants));
        System.out.println("Expected: false");
        
        other.add(new Plant("dwarf maple tree", 121.75));
        other.add(new Plant("blue star creeper flat", 15.95));
        other.add(new Plant("marigold jumbo pack", 6.20));
        
        System.out.println(plants.sameContents(other));
        System.out.println("Expected: false");
        System.out.println(other.sameContents(plants));
        System.out.println("Expected: false");
        
        other.add(new Plant("tomato plant", 4.50));
        other.add(new Plant("lemon cucumber", 4.50));
        other.add(new Plant("California poppy 6-pack", 6.00));
        
        System.out.println(plants.sameContents(other));
        System.out.println("Expected: true");
        System.out.println(other.sameContents(plants));
        System.out.println("Expected: true");
        
    }
}