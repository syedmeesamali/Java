import java.util.Scanner;
import java.util.ArrayList;

public class testSquare{
public static void main(String[] args){


ArrayList<Integer> numbers = new ArrayList<>(3);
Scanner input = new Scanner(System.in);

int[][] square = new int[3][3];
Square test1 = new Square();

   for (int i = 0; i < 3; i++)
   {
      for (int j = 0; j < 3; j++)
     {
      square[i][j] = input.nextInt();
      numbers.add(square[i][j]);
      }
   }// end of for loops
   
   System.out.println("Size of input array is: " + numbers.size());
   System.out.println("Is the array square? " + test1.isSquare((numbers.size())));
   System.out.println("Are the items unique? " + test1.isUnique(numbers));
   }
}