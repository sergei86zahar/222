package Учить._Enum_Пример;
public class Enum1 {
   enum Length {
      KM("Километр", 1000), M("Метр", 1), DM("Дециметр", 0.1), SM("Сантиметр", 0.01), MM("Миллиметр", 0.001);
      String name;
      double d;
      Length (String name, double d) {
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
      public static void main (String[] args) {
         for (Length l : Length.values()) {
            for (Length m : Length.values()) {
               if (l != m) {
                  System.out.println("1 " + l + " = " + l.coefficient(m) + m);
               }
            }
         }
         System.out.println(Length.valueOf("KM"));
         System.out.println(Enum.valueOf(Length.class, "KM"));
      }
   }
}
