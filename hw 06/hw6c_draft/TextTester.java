public class TextTester
{
    public static void main(String[] args)
    {
        Text text = new Text("An Apple a day keeps the doctor away");
        System.out.println("A's: " + text.getACount());
        System.out.println("Expected: 6");
        System.out.println("No digits: " + text.getDigitsOnly());
        System.out.println("Expected: ");
        System.out.println("firsts : " + text.firsts());
        System.out.println("Expected: AAadktda");
        
        System.out.println(text.getText());
        System.out.println("Expected: An Apple a day keeps the doctor away");
        
        text = new Text("1 2 3 going, going, gone 42");
        System.out.println("digits: " + text.getDigitsOnly());
        System.out.println("Expected: 12342");
        System.out.println("firsts: " + text.firsts());
        System.out.println("Expected: 123ggg4");
        
        text = new Text("");
        System.out.println("No digits: " + text.getDigitsOnly());
        System.out.println("Expected: ");
        System.out.println("firsts: " + text.firsts());
        System.out.println("Expected: ");
        
        text = new Text("x");
        System.out.println("firsts: " + text.firsts());
        System.out.println("Expected: x");
        
    }
}