package _Java8._Глава_21._814_ByteArrayInputStream;
// Demonstrate ByteArrayInputStream.
import java.io.*;
class ByteArrayInputStreamDemo {
   public static void main (String args[]) {
      String tmp = "abcdefghijklmnopqrstuvwxyz";
      byte[] b = tmp.getBytes();
      ByteArrayInputStream input1 = new ByteArrayInputStream(b);
      ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);
   } // Объект input 1 содержит полный алфавит в нижнем регистре,  в то время
   // как объект input2 — только первые три буквы.
}
