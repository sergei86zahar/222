package Учить._Аннотации_Уроки_Java;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
public class Main1 {
   public static void main (String[] args) {
      Main1 main1 = new Main1();
      Person1 person1 = new Person1();
      main1.reflection(person1,person1.getClass());
   }
   void reflection (Object o, Class c) {
      Field[] fields = c.getDeclaredFields();
      for (Field field : fields){
         Annotation[] annotations = field.getDeclaredAnnotations();
         for (Annotation annotation : annotations){
            if (annotation.annotationType().equals(Show.class)){
               try {
                  System.out.println(field.get(o));
               } catch (IllegalAccessException e) {
                  e.printStackTrace();
               }
            }
         }
      }
   }

}
@Retention(RetentionPolicy.RUNTIME)
@interface Show1{
   boolean value() default true;
}
class Person1 {
   @Show
   String name = "Max";
   int age = 18;
}
