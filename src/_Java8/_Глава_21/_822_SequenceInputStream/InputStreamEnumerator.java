package _Java8._Глава_21._822_SequenceInputStream;
// Demonstrate sequenced input.
// This program uses the traditional approach to closing a file.
import java.io.*;
import java.util.*;
class InputStreamEnumerator implements Enumeration <FileInputStream> {
   private Enumeration <String> files;
   public InputStreamEnumerator (Vector <String> files) {
      this.files = files.elements(); // Возвращает  перечисление компонентов
      // этого вектора. Возвращенный объект Enumeration  сгенерирует все
      // элементы в этом векторе.  Первый сгенерированный элемент - это
      // элемент с индексом 0, затем элемент с индексом 1 и т. Д.
   }
   public boolean hasMoreElements () {
      return files.hasMoreElements(); // Проверяет,  содержит ли это
      // перечисление больше элементов.
   }
   public FileInputStream nextElement () {
      try {
         return new FileInputStream(files.nextElement().toString());
      } catch (IOException e) {
         return null;
      }
   }
}
class SequenceInputStreamDemo {
   public static void main (String args[]) {
      int c;
      Vector <String> files = new Vector <String>();
      files.addElement("file1.txt");
      files.addElement("file2.txt");
      files.addElement("file3.txt");
      InputStreamEnumerator ise = new InputStreamEnumerator(files);
      InputStream input = new SequenceInputStream(ise);
      try {
         while ((c = input.read()) != -1)
            System.out.print((char) c);
      } catch (NullPointerException e) {
         System.out.println("Error Opening File.");
      } catch (IOException e) {
         System.out.println("I/O Error: " + e);
      } finally {
         try {
            input.close();
         } catch (IOException e) {
            System.out.println("Error Closing SequenceInputStream");
         }
      }
   }
}
