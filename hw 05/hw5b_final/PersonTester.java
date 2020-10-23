/**
 * Tests the Person class
 *
 * @author Kathleen O'Brien
 */
public class PersonTester
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Aruna", 19);
        System.out.println(person1.getName() + " " + person1.getAge());
        System.out.println("Expected: Aruna 19");
        person1.haveBirthday();
        System.out.println(person1.getAge());
        System.out.println("Expected: 20");
        
        Person person2 = new Person("John Jacob Jingleheimer Schmidt", 100);
        System.out.println(person2.getName() + " " + person2.getAge());
        System.out.println("Expected: John Smith 99");
        person2.haveBirthday();
        System.out.println(person2.getAge());
        System.out.println("Expected: 99");
        
        Person person3 = new Person("Maria", -10);
        person3.setName("John Jacob Jingleheimer Schmidt");
        System.out.println(person3.getName() + " " + person3.getAge());
        System.out.println("Expected: John Smith 0");
        person3.haveBirthday();
        person3.haveBirthday();
        System.out.println(person3.getAge());
        System.out.println("Expected: 2");
    }
}