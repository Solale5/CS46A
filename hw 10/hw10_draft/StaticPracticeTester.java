import java.util.ArrayList;
/**
 * Tester for the static methods of Util
 * 
 * @author Kathleen O'Brien
 */
public class StaticPracticeTester
{
    public static void main(String[] args)
    {
        //array max
        int[] numbers = {5, 6, 9, 8, 6,  7, 6};
        System.out.println("max array: "+ StaticPractice.max(numbers));
        System.out.println("Expected: 9.0");
        int[] numbers2 = {-5, -9, -8, -2, -7, -10, -5, -11};
        System.out.println("max array: "+ StaticPractice.max(numbers2));
        System.out.println("Expected: -2.0");
        int[] numbers3 = {};
        System.out.println("average array: "+ StaticPractice.max(numbers3));
        System.out.println("Expected: -2.147483648E9");
    }
}