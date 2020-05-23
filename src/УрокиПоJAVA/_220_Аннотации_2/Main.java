package УрокиПоJAVA._220_Аннотации_2;
import javax.crypto.BadPaddingException;
import javax.crypto.NoSuchPaddingException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
public class Main {
    public static void main(String[] args) throws Exception {
Main main = new Main();
Person person = new Person();
main.print(person, person.getClass());
    }
    void print(Object o, Class c) throws IllegalAccessException {
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if(annotation.annotationType().equals(Show.class)) {
                    System.out.println(field.get(o));
                }
            }
        }

    }
}
@interface Show {
    boolean value() default true;
}
class Person {
    @Show
    String name = "Max";
    int age = 18;
}
