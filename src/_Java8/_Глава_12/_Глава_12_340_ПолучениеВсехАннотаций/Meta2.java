package _Java8._Глава_12._Глава_12_340_ПолучениеВсехАннотаций;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}
@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}
@What(description = "Аннотация тестового класса ")
@MyAnno(str = "Meta2 ", val = 99)
public class Meta2 {
    @What(description = "Аннотация тестового метода ")
    @MyAnno(str = " Testing ", val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();
        try {
            Annotation[] annos = ob.getClass().getAnnotations();
            // вывести все аннотации для класса Меtа2
            System.out.println("Bce аннотации для класса Meta2: ");
            for (Annotation a : annos) {
                System.out.println(a);
            }
            System.out.println();
            // вывести все аннотации для метода myMeth()
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("Bce аннотации для метода myMeth(): ");
            for (Annotation a : annos) {
                System.out.println(a);
            }
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}


