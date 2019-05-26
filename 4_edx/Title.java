public class Title extends Name
{
  private String fName;
  private String lName;
  
  super(title, gender);
  public Title(String fName,String lName) // Constructor method for Title - This class already inherits from "Name" class
  {
    this.fName = fName;
    this.lName = lName;
  }
  
  public void disp_name() //Display first and last name method
    {
      System.out.println(fName + "  " + lName);
    }
}