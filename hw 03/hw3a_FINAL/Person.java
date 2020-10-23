
public class Person
{
    private String name;
    private int age;
    
    /**
     * Constructs a new person with the given name and age
     * @param theName the name of this Person object
     * @param theAge the age of this Person object
     */
    public Person (String theName, int theAge) 
    {
         name = theName;
         age = theAge;
    }

    /**
     * Gets the name of this Person
     * @return the name of this person
     */
    public String getName() 
    { 
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
    }

}