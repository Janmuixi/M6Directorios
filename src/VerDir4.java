import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;

public class VerDir4 {
   public static void main(String[] args) {      
      File f = null;
      File[] paths;
      
      try {  
    	  for (String s: args) {
    		  f = new File(s);
    	         
	         paths = f.listFiles();
	         
	         for(File path:paths) {
	         
	            System.out.println(path);
	         }
          }
         
         
      } catch(NullPointerException e) {
         System.out.println("No existe esa ruta");
      }
   }
}