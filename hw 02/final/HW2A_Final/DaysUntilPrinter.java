public class DaysUntilPrinter
{
   public static void main(String[] args)
    {
        Day today = new Day();
        Day thanksgiving =new Day(2018,11,22);
    
        
        
        int daysuntil = thanksgiving.daysFrom(today);
        System.out.println("Today is " + today);
        System.out.println(daysuntil);
        today.addDays(30);
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
        
        
        
    }
}