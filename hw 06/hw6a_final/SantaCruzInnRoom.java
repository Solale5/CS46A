/**
 * Models a room in a Santa Cruz motel.
 *
 */
public class SantaCruzInnRoom
{
    private String season;
    private int guests;
    public static final double COST_PER_EXTRA_PERSON = 50.5;
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
     * Gets the number of people renting the room
     * @return the number of people in the room
     */
    public int getGuests() 
    {
        return guests;
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
     * @return cost
     */
    public double getCost()
    {

        double cost = 0;
        if(this.season.equals("high"))
        {
            if (this.guests >= 1 && this.guests <= 2   )
            {
                cost = 250;
            }
            else if (this.guests >= 3 && this.guests <= 4)
            {
                cost = 375;
            }
            else if(this.guests > 4)

            { cost = 375 + 50.50 * (this.guests - 4);
            }
        }

        if(this.season.equals("low"))
        {
            if (this.guests >= 1 && this.guests <= 2   )
            {
                cost = 200;
            }
            else if (this.guests >= 3 && this.guests <= 4)
            {
                cost = 300;
            }
            else if(this.guests > 4)

            { cost = 300 + 50.50 * (this.guests - 4);
            }

        }
        return cost;
    }
}

