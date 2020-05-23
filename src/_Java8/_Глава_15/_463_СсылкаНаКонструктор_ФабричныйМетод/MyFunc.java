package _Java8._Глава_15._463_СсылкаНаКонструктор_ФабричныйМетод;
public interface MyFunc<R, T> {
    R func(T n);
}
class MyClass<T> {
    private T val;
    MyClass(T v) {
        val = v;
    }
    MyClass() {
        val = null;
    }
    T getVal() {
        return val;
    }
}
class MyClass2 {
    String str;
    MyClass2(String s) {
        str = s;
    }
    MyClass2() {
        str = "";
    }
    String getVal() {
        return str;
    }
}
class ConstructorRefDemo3 {
    // Фабричный метод для объектов разных классов. У каждого класса должен быть свой
    // конструктор , принимающий один параметр типа Т. А параметр R обозначает тип
    // создаваемого объекта
    static <R, T> R myClassFactory(MyFunc<R, T> cons, T v) {
        return cons.func(v);
    }
    public static void main(String[] args) {
        /*
        Создать ссылку на конструктор класса МyClass. В данном случае оператор new
        обращается к конструктору, принимающему аргумент
         */
        MyFunc<MyClass<Double>, Double> myClassCons = MyClass<Double>::new;
        MyClass<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
        MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;
        MyClass2 mc2 = myClassFactory(myClassCons2, "Лямбда");
        System.out.println("Значение str в объекте mc2 равно " + mc2.getVal());
    }
}
/*
Как видите, метод myClassFactory () используется для создания объектов типа
MyClass<Double> и MyClass2. Несмотря на отличия в обоих классах, в частности,
класс MyClass является обобщенным, а класс MyClass2 - необобщенным, объекты обоих
классов  могут быть созданы с помощью фабричного метода myClass
Factory () , поскольку оба они содержат конструкторы, совместимые с методом
func () из функционального интерфейса MyFunc, а методу myClassFactory () пере­дается
конструктор того класса, объект которого требуется создать.
 */
