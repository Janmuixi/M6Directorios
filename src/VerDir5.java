import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;

public class VerDir5 {
   public static void main(String[] args) {      
      File f = null;
      File[] paths;
      
      try {  
    	  for (String s: args) {
    		  f = new File(s);
    	         
	         paths = f.listFiles();
	         
	         for(File path:paths) {
	        	System.out.println("FICHERO:");
	            System.out.println("Name: "+path.getName());
	            System.out.println("Path: "+path.getPath());	
	            System.out.println("Absolute path"+path.getAbsolutePath());
	            System.out.println("Can Read? "+path.canRead());
	            System.out.println("Can Write? "+path.canWrite());
	            System.out.println("Size: "+path.length());
	         }
          }
         
         
      } catch(NullPointerException e) {
         System.out.println("No existe esa ruta");
      }
   }
}