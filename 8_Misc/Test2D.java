import java.util.Scanner;
import javafx.geometry.Point2D;

public class Test2D {
    public static void main(String[], args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter point-1's x, y: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter point-2's x, y: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        java.awt.geom.Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);
        System.out.println("P1 point is: " + p1.toString);
        System.out.println("P2 point is: " + p2.toString);
        System.out.println("Distance of p1 to p2 is: " + p1.distance(p2));
    }
} //End of main class