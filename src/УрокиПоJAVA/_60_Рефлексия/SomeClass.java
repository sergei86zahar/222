package УрокиПоJAVA._60_Рефлексия;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
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
        Class clss2 = SomeClass.class;
        Class clss3 = Class.forName("УрокиПоJAVA._60_Рефлексия.SomeClass");
        // получить ещё один экземпляр без слова new
        //SomeClass someClass1 = (SomeClass) clss.newInstance(); // newInstance - метод
        // класса Object.
        Constructor[] constructors = clss.getConstructors(); // доступ ко всем
        // существующим конструкторам
        Constructor[] constructors1 = clss.getDeclaredConstructors(); // доступ к
        // задекларированным в этом классе конструкторам
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
        }
    }
}
