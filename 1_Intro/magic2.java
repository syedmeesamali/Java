import java.util.ArrayList;

public boolean isSquare(ArrayList mat) {
   if (Math.sqrt(mat.size()) % 1 === 0) {
      return True;
    }
    else {
      return False;
    }
}