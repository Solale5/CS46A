/**
 * Models a room in a Santa Cruz motel.
 *
 */
public class SantaCruzInnRoom
{
    private String season;
    private int guests;

    /**
     * constructor for rooms
     * @param season is the season
     * @param numberOfGuests is the number of guests
     */
    public SantaCruzInnRoom(String season, int numberOfGuests)
    { 
      if (season != "high" && season != "low")
        {
            this.season = "high";
        }
        else if( season.equals("low"))
        {
            this.season = season;
        }
        else if( season.equals("high"))
        {
            this.season = season;
        }
        this.guests = numberOfGuests;
        setGuests(guests);

    }
    /**
     * Gets the season during which this room is rented
     * @return the season during which this room is rented
     */
    public String getSeason()
    {
        return season;   
    }

    /**
     * Gets the number of people renting the room
     * @return the number of people in the room
     */
    public int getGuests() 
    {
        return guests;
   }

   /**
    * sets the number of guests
    * @param numberOfGuests is the number of guests
    * 
    */
   public void setGuests(int numberOfGuests)
    {
        if ( numberOfGuests <= 0)
        {
            this.guests = 4;
        }
        else
        {
            this.guests = numberOfGuests;
        }
        
    }

   /**
    * gets the cost
    * @return 0.0
    */
   public double getCost()
    {
        return  0.0;
    }

}