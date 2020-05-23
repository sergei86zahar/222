package _Java8._Глава_21._800_Каталоги;
import java.io.File;
class DirList {
   public static void main (String args[]) {
      String dirname = "C://Program Files/Java/jdk-14.0.1";
      File f1 = new File(dirname);
      if (f1.isDirectory()) {
         System.out.println("Directory of " + dirname);
         String[] s = f1.list(); //  Возвращает массив строк с именами файлов
         // и каталогов в каталоге, обозначенном этим абстрактным путем.
         for (int i = 0; i < s.length; i++) {
            File f = new File(dirname + "/" + s[i]);
            if (f.isDirectory()) {
               System.out.println(s[i] + " is a directory");
            } else {
               System.out.println(s[i] + " is a file");
            }
         }
      } else {
         System.out.println(dirname + " is not a directory");
      }
   }
}
