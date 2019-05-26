public class inheritancedemo
{
  public static void main(String[] args)
   {
      Name newObj = new Name("Alex", 'M'); //Create Name Object
      Title newTitle = new Title("Meesam", "Ali", "SMeesam",'m'); //Create Title Object
      
      System.out.println("Title is: " + newObj.name);
      System.out.println("Gender is: " + newObj.gender);
      newTitle.disp_name(); //This already has a display functionality
      System.out.println("Gender for title is: " + newTitle.gender);
   }
} //End of demo class