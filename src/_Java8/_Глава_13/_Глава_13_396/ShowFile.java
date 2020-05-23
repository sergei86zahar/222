package _Java8._Глава_13._Глава_13_396;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class ShowFile {
   public static void main (String args[]) {
      int i;
      // First, confirm that a file name has been specified.
      if (args.length != 1) {
         System.out.println("Usage: ShowFile filename");
         return;
      }
      // The following code uses a try-with-resources statement to open
      // a file and then automatically close it when the try block is left.
      try (FileInputStream fin = new FileInputStream(args[0])) {
         do {
            i = fin.read();
            if (i != -1)
               System.out.print((char) i);
         } while (i != -1);
      } catch (FileNotFoundException e) {
         System.out.println("File Not Found.");
      } catch (IOException e) {
         System.out.println("An I/O Error Occurred");
      }
   }
}
