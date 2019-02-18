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
  
  //Below three methods call the order function
  void inOrder() {      orderin(root);   }

  void preOrder() {     orderpre(root);  }

  void postOrder() {    orderpost(root); }
  
  //This will print the nodes inORDER
  void orderin(Node root)
  {
   if (root != null)
   {
      orderin(root.left);
      System.out.println(root.value);
      orderin(root.right);
   }
  }
  
  //This will print the nodes preORDER
  void orderpre(Node root)
  {
   if (root != null)
   {
      System.out.println(root.value);
      orderpre(root.left);
      orderpre(root.right);
   }
  }

  //This will print the nodes postORDER
  void orderpost(Node root)
  {
   if (root != null)
   {
      orderpost(root.left);
      orderpost(root.right);
      System.out.println(root.value);
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
   
   //Implementation of size method
   public boolean find(int value)
   {
      return search(root, value);
   }
   
   // A utility function to search a given key in BST 
   public boolean search(Node root, int value) 
   { 
    if (root==null)
        return false; 
    return root.value==value || search(root.left, value) || search(root.right, value);
   } //End of search method 

}//End of program