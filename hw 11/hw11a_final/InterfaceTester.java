public class InterfaceTester
{
   public static void main(String[] args)
   {
       GeometricShape shape = new Parallelogram(10, 15);
       System.out.println(shape.area());
       System.out.println("Expected: 150.0");
       
       shape = new Parallelogram(11, 11);
       System.out.println(shape.area());
       System.out.println("Expected: 121.0");
   }
}