package _Java8._Глава_12._Глава_12_343_АннотацииМаркеры;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention (RetentionPolicy.RUNTIME)
@interface MyMarker {
}
public class Marker {
   @MyMarker
   public static void myMeth () {
      Marker ob = new Marker();
      try {
         Method m = ob.getClass().getMethod("myMeth");
         // определить наличие аннотации
         if (m.isAnnotationPresent(MyMarker.class)) {
            System.out.println("Аннотация-маркер MyMarker присутствует.");
         }
      } catch (NoSuchMethodException exc) {
         System.out.println("Метод не найден");
      }
   }
   public static void main (String[] args) {
      myMeth();
   }
}
