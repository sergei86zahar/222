package Учить._Аннотации_Уроки_Java;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
public class Main {
   public static void main (String[] args) {
      Main main = new Main();
      Person person = new Person();
      main.reflection(person, person.getClass());
   }
   void reflection (Object o, Class c) {
      Field[] fields = c.getDeclaredFields();
      for (Field field : fields) {
         Annotation[] annotations = field.getDeclaredAnnotations();
         for (Annotation annotation : annotations) {
            if (annotation.annotationType().equals(Show.class)) {
               try {
                  System.out.println(field.get(o)); // get() -  Возвращает
                  // значение поля, представленного этим полем, для указанного объекта.
               } catch (IllegalAccessException e) {
                  e.printStackTrace();
               }
            }
         }
      }
   }
}
@Retention (RetentionPolicy.RUNTIME)
@interface Show {
   boolean value () default true;
}
class Person {
   @Show
   String name = "Max";
   int age = 18;
}
