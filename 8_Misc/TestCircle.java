public class TestCircle 
{
    public static void main(String[] args)
    {
       Circle circ1 = new Circle();
       Circle circ2 = new Circle();
       System.out.println("New circle created");
       circ1.rad = 5;
       System.out.println("Area of circle with " + circ1.rad + " is: " + circ1.getArea());

       System.out.println("Area of circle2 with rad " + circ2.rad + " is: " + circ2.getArea());
    }    //End of static main
} //End of class