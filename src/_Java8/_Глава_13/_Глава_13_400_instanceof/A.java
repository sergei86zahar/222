package _Java8._Глава_13._Глава_13_400_instanceof;
public class A {
   public static void main (String[] args) {
      new A().f("Hello, world!");
   }
   public void f (Object obj) {
      if (obj instanceof String) {
         String str = (String) obj;
         System.out.println(str.toLowerCase());
      }
   }
}

