package _Java8._Глава_9._Глава_9_Переменные_В_Интерфейсах_239_Random;
import java.util.Random;
public class AskMe implements SharedConstants {
   public static void main (String[] args) {
      Question q = new Question();
      answer(q.ask());
      answer(q.ask());
      answer(q.ask());
      answer(q.ask());
   }
   static void answer (int result) {
      switch (result) {
         case NO:
            System.out.println("Нет");
            break;
         case YES:
            System.out.println("Да");
            break;
         case MAYBE:
            System.out.println("Возможно");
            break;
         case LATER:
            System.out.println("Позже");
            break;
         case SOON:
            System.out.println("Вскоре");
            break;
         case NEVER:
            System.out.println("Никогда");
            break;
      }
   }
}
class Question implements SharedConstants {
   Random rand = new Random();
   int ask () {
      int prob = (int) (100 * rand.nextDouble());  // используется метод nextDoubie ().
      // Он возвращает случайные числа в диапазоне от 0.0 до 1.0.
      if (prob < 30) {
         return NO;  // 60%
      } else if (prob < 60) {
         return YES;  // 30%
      } else if (prob < 75) {
         return LATER;  // 15%
      } else if (prob < 98) {
         return SOON;  // 13%
      } else {
         return NEVER;  // 2%
      }
   }
}
interface SharedConstants {
   int NO = 0;
   int YES = 1;
   int MAYBE = 2;
   int LATER = 3;
   int SOON = 4;
   int NEVER = 5;
}
