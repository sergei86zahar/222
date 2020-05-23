package _Java8._Глава_21._801_интерфейс_FilenameFilter;
// Directory of .HTML files.
import java.io.*;
class DirListOnly {
   public static void main (String args[]) {
      String dirname = "C://Program Files/Java/jdk-14.0.1/bin";
      File f1 = new File(dirname);
      FilenameFilter only = new OnlyExt("exe");
      String[] s = f1.list(only);
      if (s != null) {
         for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
         }
      }
   }
}
class OnlyExt implements FilenameFilter {
   String ext;
   public OnlyExt (String ext) {
      this.ext = "." + ext;
   }
   public boolean accept (File dir, String name) {
      return name.endsWith(ext);
   }
}
