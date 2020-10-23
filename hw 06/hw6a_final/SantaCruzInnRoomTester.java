/**
 * Tester for SantaCruzInnRoom
 */
public class SantaCruzInnRoomTester
{
    public static void main(String[] args)
    {
        SantaCruzInnRoom room = new SantaCruzInnRoom("high", 1);
        System.out.println(room.getSeason() + " " + room.getGuests()
           + " " + room.getCost());
        System.out.println("Expected: high 1 250.0");
        
        room.setGuests(2);
        System.out.println(room.getSeason() + " " + room.getGuests()
           + " " + room.getCost());
        System.out.println("Expected: high 2 250.0");
        
        room.setGuests(3);
        System.out.println(room.getSeason() + " " + room.getGuests()
           + " " + room.getCost());
        System.out.println("Expected: high 3 375.0");
        
        room.setGuests(-3);
        System.out.println(room.getSeason() + " " + room.getGuests()
           + " " + room.getCost());
        System.out.println("Expected: high 4 375.0");
        
        room = new SantaCruzInnRoom("hight", 6);
        System.out.println(room.getSeason() + " " + room.getGuests()
           + " " + room.getCost());
        System.out.println("Expected: high 6 476.0");
        
        room = new SantaCruzInnRoom("low", 1);
        System.out.println(room.getSeason() + " " + room.getGuests()
           + " " + room.getCost());
        System.out.println("Expected: low 1 200.0");
        
        room = new SantaCruzInnRoom("low", 2);
        System.out.println(room.getSeason() + " " + room.getGuests()
           + " " + room.getCost());
        System.out.println("Expected: low 2 200.0");
        
        room.setGuests(3);
        System.out.println(room.getSeason() + " " + room.getGuests()
           + " " + room.getCost());
        System.out.println("Expected: low 3 300.0");
        
        room = new SantaCruzInnRoom("low", 0);
        System.out.println(room.getSeason() + " " + room.getGuests()
           + " " + room.getCost());
        System.out.println("Expected: low 4 300.0");
        
        room.setGuests(4);
        System.out.println(room.getSeason() + " " + room.getGuests()
           + " " + room.getCost());
        System.out.println("Expected: low 4 300.0");
       
        room = new SantaCruzInnRoom("low", 5);
        System.out.println(room.getSeason() + " " + room.getGuests()
           + " " + room.getCost());
        System.out.println("Expected: low 5 350.5");
        
        
    }
}