class Title 
{
  public String title;
  public char gender; // Mistake one
  public Title (String title, char gender)
  {
  this.title=title;
  this.gender=gender;
  }
}

class Name extends Title 
{
  private String fName;
  private String lName;

  super (title, gender);

  public Name(String fName,String lName)
  { //Mistake two
    this.fName = fName;
    this.lName = lName;
    }
  
  public String_to_string()
  {
    return fName+"\t"+lName;
  }
}
public class inheritancedemo{ //Mistake three
public static void main (String[] args){
Name nameObj=new Name("Alex ",'M');
}
}