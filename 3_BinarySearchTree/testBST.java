import java.util.*;

public class testBST
{
   public static void main(String[] args)
   {
      BST tree1 = new BST();
      BST tree2 = new BST();
      tree1.add(12);
      tree1.add(22);
      tree1.add(18);
      tree1.add(25);
      tree1.add(29);
      tree1.add(35);
      tree1.add(7);
      
      tree2.add(12);
      tree2.add(22);
      tree2.add(18);
      tree2.add(25);
      tree2.add(29);
      tree2.add(35);
      tree2.add(7);
      tree1.inOrder();
      tree2.inOrder();
      compare(tree1, tree2);
   }//End of main method
}


