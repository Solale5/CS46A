
public class Person
{
    private String name;
    private int age;
    public static final int DEFAULT_AGE = 0;
    public static final int MAX_AGE = 99;

    /**
     * Constructs a new person with the given name and age
     * @param theName the name of this Person object
     * @param theAge the age of this Person object
     */
    public Person (String theName, int theAge) 
    {
        name = theName;
        age = theAge;
        if (age < 0)
        { age = DEFAULT_AGE;
        }
        if(age > 99)
        { age = MAX_AGE;
        }
        
    }

    /**
     * Gets the name of this Person
     * @return the name of this person
     */
    public String getName() 
    {
        if(name.equals("John Jacob Jingleheimer Schmidt"))
        {
            name = "John Smith";
        }
         return name;
         
    }
    

    /**
     * Gets the age of this Person
     * @return this presons age
     */
    public int getAge()
    {
        
        return age;
    }

    /**
     * Sets the new name for this Person
     * @param newName the new name for this Person
     */
    public void setName(String newName) 
    { 
        name = newName;
        
    } 

    /**
     * Adds one to this Person's age
     */
    public void haveBirthday()
    {
        age = age + 1;
        if(age < 0)
        { age = DEFAULT_AGE;
        }
        if(age > 99)
        {
            age = MAX_AGE;
        }
        
    }

}