package Учить._Глава_13_400_instanceof;
public class A1 {
   public static void main (String[] args) {
      new A().f("Hello, world!");
   }
   public void f (Object obj) {
      if (obj instanceof String str) {
         System.out.println(str.toLowerCase());
      }
   }
}
