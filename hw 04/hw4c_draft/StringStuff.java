import java.util.Scanner;

public class StringStuff
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter your full name: "); 
        String name = scan.next();

        System.out.println(name.substring(0,1));
        String lastName = scan.nextLine();
        System.out.println(lastName.substring(lastName.length() - 1));
        


    }




}        