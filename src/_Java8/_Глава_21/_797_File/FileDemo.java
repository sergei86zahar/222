package _Java8._Глава_21._797_File;
import java.io.File;
class FileDemo {
   static void print (String s) {
      System.out.println(s);
   }
   public static void main (String args[]) {
      File f1 = new File("/java/COPYRIGHT");
      print("File Name: " + f1.getName());
      print("Path: " + f1.getPath()); // Преобразует этот абстрактный путь в строку пути.
      print("Abs Path: " + f1.getAbsolutePath()); // Возвращает строку абсолютного пути этого абстрактного пути.
      print("Parent: " + f1.getParent()); // Возвращает строку пути родителя этого абстрактного пути или ноль, если это имя пути не содержит имя родительского каталога.
      print(f1.exists() ? "exists" : "does not exist");
      print(f1.canWrite() ? "is writeable" : "is not writeable"); // Проверяет, может ли приложение изменить файл, обозначенный этим абстрактным путем.
      print(f1.canRead() ? "is readable" : "is not readable"); // Проверяет, может ли приложение прочитать файл, обозначенный этим абстрактным путем.
      print("is " + (f1.isDirectory() ? "" : "not" + " a directory")); // Проверяет, является ли файл, обозначенный этим абстрактным путем, каталогом.
      print(f1.isFile() ? "is normal file" : "might be a named pipe"); // Проверяет, является ли файл, обозначенный этим абстрактным путем, обычным файлом. Файл является нормальным, если он не является каталогом и, кроме того, удовлетворяет другим системно-зависимым критериям.
      print(f1.isAbsolute() ? "is absolute" : "is not absolute"); // Проверяет, является ли этот абстрактный путь абсолютным. Определение абсолютного пути зависит от системы.
      print("File last modified: " + f1.lastModified()); //  Возвращает время последнего изменения файла, обозначенного этим абстрактным путем.
      print("File size: " + f1.length() + " Bytes");
   }
}
