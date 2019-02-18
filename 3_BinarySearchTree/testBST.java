import java.util.*;

public class testBST
{
   public static void main(String[] args)
   {
      BST tree = new BST();
      tree.add(12);
      tree.add(22);
      tree.add(18);
      tree.add(25);
      tree.add(29);
      tree.add(35);
      tree.add(7);
      System.out.println("Find number 25 in tree:" + tree.find(17));
      tree.postOrder();
      
   }//End of main method
}


