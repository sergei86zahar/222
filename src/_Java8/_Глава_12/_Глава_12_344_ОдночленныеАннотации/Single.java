package _Java8._Глава_12._Глава_12_344_ОдночленныеАннотации;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int value();  // Эта переменная должна иметь имя value
}
public class Single {
    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}
