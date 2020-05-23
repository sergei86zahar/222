package _Java8._Глава_21._809_FileInputStream;
import java.io.IOException;
// Demonstrate FileInputStream.
// This program uses try-with-resources. It requires JDK 7 or later.
import java.io.*;
class FileInputStreamDemo {
   public static void main (String args[]) {
      int size;
      // Для автоматического закрытия потока ввода
      //используется оператор try с ресурсами
      try (FileInputStream f = new FileInputStream("C://Users/serge" +
              "/IdeaProjects/222/src/file")) {
         System.out.println("Общее количество доступных байтов: " + (size =
                 f.available()));
         int n = size / 40;
         System.out.println("First " + n + " байтов, прочитанных из файла по " +
                 "очереди методом read()");
         for (int i = 0; i < n; i++) {
            System.out.print((char) f.read());
         }
         System.out.println("\nBce еще доступно: " + f.available());
         System.out.println("Чтение следующих " + n + " байтов по очереди методом read(b[])");
         byte[] b = new byte[n];
         if (f.read(b) != n) {
            System.err.println("Нельзя прочитать " + n + " байтов.");
         }
         System.out.println(new String(b, 0, n));
         System.out.println("\nBce еще доступно:: " + (size = f.available()));
         System.out.println("Пропустить половину оставшихся байтов методом skip()");
         f.skip(size / 2);
         System.out.println("Все еще доступно: " + f.available());
         System.out.println("Чтение " + n / 2 + " байтов, размещаемых в конце массива");
         if (f.read(b, n / 2, n / 2) != n / 2) {
            System.err.println("Нельзя прочитать " + n / 2 + " bytes.");
         }
         System.out.println(new String(b, 0, b.length));
         System.out.println("\nBce еще доступно:: " + f.available());
      } catch (IOException e) {
         System.out.println("Ошибка ввода-вывода:: " + e);
      }
   }
}
