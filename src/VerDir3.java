import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;

public class VerDir3 {
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
         
         
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}