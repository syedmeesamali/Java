public class Title 
{
  public String title;
  public char gender;
  public Title(String titleVal, char genderVal)
  {
      title = titleVal;
      gender = genderVal;
  }

class Name extends Title 
{
  private String fName;
  private String lName;

  public Name(String fName,String lName)
  {
    this.fName = fName;
    this.lName = lName;
    
  }
  
  public void disp_name()
    {
      System.out.println(fName + "  " + lName);
    }
}


   

}

