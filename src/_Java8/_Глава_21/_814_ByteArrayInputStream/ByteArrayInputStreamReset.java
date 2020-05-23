package _Java8._Глава_21._814_ByteArrayInputStream;
import java.io.*;
/*
Класс ByteArrayInputStream реализует методы mark () и reset (). Но если метод
 mark () не вызывается, то метод reset () устанавливает указатель на начало
 потока ввода (в данном случае — начало массива байтов, передаваемого
 конструктору данного класса). В приведенном ниже примере показано,  как
 пользоваться методом reset () для чтения одних и тех же вводимых данных
 дважды.  В данном случае  программа читает и выводит буквы "abc" сначала в
 нижнем регистре, а затем в верхнем.
 */
class ByteArrayInputStreamReset {
   public static void main (String args[]) {
      String tmp = "abc";
      byte[] b = tmp.getBytes();
      ByteArrayInputStream in = new ByteArrayInputStream(b);
      for (int i = 0; i < 2; i++) {
         int c;
         while ((c = in.read()) != -1) {
            if (i == 0) {
               System.out.print((char) c);
            } else {
               System.out.print(Character.toUpperCase((char) c));
            }
         }
         System.out.println();
         in.reset(); // reset ()  устанавливает указатель на начало потока
         // ввода (в данном случае — начало массива байтов,  передаваемого
         // конструктору данного класса
         /*
         В данном примере каждый символ сначала читается из потока ввода,  а
         затем выводится без изменений в нижнем регистре.  Далее поток ввода
         устанавливается в исходное состояние,  и чтение данных начинается
         снова,  но на этот раз каждый символ преобразуется в верхний регистр
          букв перед выводом.
          */
      }
   }
}
