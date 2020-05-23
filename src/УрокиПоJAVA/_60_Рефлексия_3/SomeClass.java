package УрокиПоJAVA._60_Рефлексия_3;
import java.lang.reflect.*;
public class SomeClass {
    private static transient int i;
    String s;
    public SomeClass() {
    }
    SomeClass(String s) {
        this.s = s;
    }
    public String someMethod(String s) {
        System.out.println("this is " + s);
        return s;
    }
}
/*
Рефлексия- это языко­вое средство для получения сведений о классе во время выполнения программы.
Прикладной программный интерфейс (API) для рефлексии входит в состав пакета
java.lang.reflect. Пользоваться рефлексией можно самыми разными способами.
Первый шаг с целью воспользоваться рефлексией состоит в получении объекта
типа class.
Имеются разные способы получения объекта типа Class. Самый простой из них - вызвать
метод getClass () , определенный в классе Object. Его общая форма приведена
ниже. Этот метод возвращает объект типа Class, который представляет вызывающий
объект.
Имея в своем распоряжении объект типа Class, можно воспользоваться его
методами для получения сведений о различных элементах, объявленных в классе,
включая и его аннотацию.
Например, класс Class предоставляет (среди прочего) методы getMethod (), getField ()  и
 getConstructor () , возвращающие сведения о методе, поле и конструкторе соответственно
 . Эти  методы возвращают объекты типа
Method, Field и Constructor .
 */
class Main {
    public static void main(String[] args) throws Exception {
        SomeClass someClass = new SomeClass();
        // три основных способа получить объект класса с которым мы можем работать
        Class clss = someClass.getClass();
        System.out.println(clss.getName());
        System.out.println("");
        System.out.println("Constructors");
        Constructor[] constructors = clss.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
        }
        System.out.println("");
        System.out.println("Methods");
        Method[] methods = clss.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType());
            }
            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println(method.getReturnType().getName());
            method.invoke(someClass, "test");
        }
        System.out.println("");
        System.out.println("fields");
        Field[] fields = clss.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getType().getName());
            System.out.println(Modifier.toString(field.getModifiers()));
            field.setAccessible(true);
            System.out.println(field.getInt(someClass));
            field.setInt(someClass, 5);
            System.out.println(field.getInt(someClass));
        }
    }
}
