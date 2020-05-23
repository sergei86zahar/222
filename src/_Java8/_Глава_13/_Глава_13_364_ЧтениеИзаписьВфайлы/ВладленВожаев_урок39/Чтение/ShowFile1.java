package _Java8._Глава_13._Глава_13_364_ЧтениеИзаписьВфайлы.ВладленВожаев_урок39.Чтение;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class ShowFile1 {
   public static void main (String[] args) {
      try (FileInputStream fin = new FileInputStream("D://hello.txt"); FileOutputStream fos = new FileOutputStream("D://hello1.txt", true)) {
         int i = -1;
         while ((i = fin.read()) != -1) {
            System.out.print((char) i);
            char buffer = (char) i;
            fos.write(buffer);
         }
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
