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
   
  //Recursive function to add values (integer) the tree
  Node insert(Node root, int value)
  {
   //if tree is empty return a new node
   if (root == null)
   {
      root = new Node(value);
      return root;
   }
      
      if(value < root.value)
         root.left = insert(root.left, value);
      else if (value > root.value)
         root.right = insert(root.right, value);
         
      return root;
  }
  
  //This method calls the order function
  void inOrder()
  {
      order(root);
  }
  
  //This will print the nodes inORDER
  void order(Node root)
  {
   if (root != null)
   {
      order(root.left);
      System.out.println(root.value);
      order(root.right);
   }
  }
  
  //Get size of the tree
  int size()
  {
   return size(root);
  }
  //Implementation of size method
  int size(Node node)
  {
   if (node == null)
      return 0;
   else
      return size(node.left) + 1 + size(node.right);
  }

}//End of program