package _Java8._Глава_12._Enum_Пример;
public class EnumExample_02 {
   public enum Length {
      KM("Километр", 1000), M("Метр", 1), DM("Дециметр", 0.1), CM("Сантиметр", 0.01), MM("Миллиметр", 0.001);
      String name;
      double d;
      private Length (String name, double d) {
         this.name = name;
         this.d = d;
      }
      @Override
      public String toString () {
         return name;
      }
      double coefficient (Length inp) {
         return d / inp.d;
      }
   }
   public static void main (String[] args) {
      for (Length l1 : Length.values())
         for (Length l2 : Length.values())

            if (l1 != l2)
               System.out.println("1 " + l1 + " = " + l1.coefficient(l2) + " " + l2);
      //Два способа получения enum объекта по строковому представлению
      System.out.println(Length.valueOf("KM"));
      System.out.println(Enum.valueOf(Length.class, "KM"));
   }
}
