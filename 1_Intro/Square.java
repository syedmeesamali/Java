import java.util.ArrayList;

public class Square{
   
   ArrayList<Integer> mat
   public boolean	isSquare()	{
	   if	(Math.sqrt(mat.size()) % 1	== 0) {
	   	return true;
	    }
	    else	{
	   	return false;
	    }
   }
/*
   public boolean	isSquare(ArrayList mat)	{
	   if	(Math.sqrt(mat.size()) % 1	=== 0) {
	   	return True;
	    }
	    else	{
	   	return False;
	    }
   }
*/


}