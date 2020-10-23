/**
 * Tester for SantaCruzInnRoom
 */
public class SantaCruzInnRoomTester
{
    public static void main(String[] args)
    {
        SantaCruzInnRoom room = new SantaCruzInnRoom("high", 2);
        System.out.println(room.getSeason() + " " + room.getGuests()
           + " " + room.getCost());
        System.out.println("Expected: high 2 0.0");
        
        room = new SantaCruzInnRoom("low", 0);
        System.out.println(room.getSeason() + " " + room.getGuests()
           + " " + room.getCost());
        System.out.println("Expected: low 4 0.0");
        
        room = new SantaCruzInnRoom("hight", 6);
        System.out.println(room.getSeason() + " " + room.getGuests()
           + " " + room.getCost());
        System.out.println("Expected: high 6 0.0");
        
        room.setGuests(-3);
        System.out.println(room.getSeason() + " " + room.getGuests()
           + " " + room.getCost());
        System.out.println("Expected: high 4 0.0");
        
        
    }
}