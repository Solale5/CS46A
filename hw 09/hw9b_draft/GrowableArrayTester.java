public class GrowableArrayTester
{

   public static void main(String[] args)
   {
      GrowableArray processor = new GrowableArray();
      processor.add("Mary");
      processor.add("had");
      processor.add("a");
      processor.add("little");
      processor.add("lamb");
      
      System.out.println(processor.toString());
      System.out.println("Expected: [Mary, had, a, little, lamb]");
      
      
      processor.add("Its");
      processor.add("fleece");
      processor.add("was");
      processor.add("white");
      processor.add("as");    
      processor.add("snow");
      System.out.println(processor.toString());
      System.out.println("Expected: [Mary, had, a, little, lamb, Its, fleece, was, white, as, snow]");
      
   }

}