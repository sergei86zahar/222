package _Java8._Глава_12._Глава_12_338_Аннотации;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str();
    int val();
}
class Meta {
    // аннотировать метод
    @MyAnno(str = "Пример аннотации", val = 100)
    public static void myMeth(String str, int i) {
        Meta ob = new Meta();
        // получение аннотации из метода и вывести значения её членов
        try {
            // сначала получить объект типа Class, предшествующий данный класс
            Class<?> c = ob.getClass();
            // затем получить объект типа Method, предшествующий данный метод
            Method m = c.getMethod("myMeth", String.class, int.class);
            // далее получить аннотацию для данного класса
            MyAnno anno = m.getAnnotation(MyAnno.class);
            // и наконец, вывести значения членов аннотации
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден");
        }
    }
    public static void main(String[] args) {
        myMeth("Тест", 10);
    }
}
