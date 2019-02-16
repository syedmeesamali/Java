import java.util.*;

public class BST
{
   class Node  //Class containing left and right nodes and key value (int)
   {
      int value;
      Node left, right;
      
      public Node(int item)
      {
         value = item;
         left = right = null;
      }
   }
   
   //Root of the whole Binary Search Tree
   Node root;
   
   //Constructor method
   BST() 
   {
      root = null;
   }
   
   //Method to add items to BST
   void add(int value)
   {
      root = insert(root, value);
   }
   

}//End of full class