package _Java8._Глава_14._Глава_14_423_ОбобщённыйСуперкласс;
// В п одкл асс м огут б ыть в в е дены с в ои п ар аметры типа
class Gen<T> {
    T ob; // declare an object of type T    объя в ить объе к т т ипа Т
    // Pass the constructor a reference to
    // an object of type T. п ередать к онс1·р уктору с сыл ку на объе к т т ипа Т
    Gen(T o) {
        ob = o;
    }
    // Return ob.
    T getob() {
        return ob;
    }
}
// A subclass of Gen that defines a second
// type parameter, called V.  Подкласс,  производный от класса Gen , где  передаётся
// второй  параметр типа V
class Gen2<T, V> extends Gen<T> {
    V ob2;
    Gen2(T o, V o2) {
        super(o);
        ob2 = o2;
    }
    V getob2() {
        return ob2;
    }
}
// Create an object of type Gen2.
class HierDemo {
    public static void main(String args[]) {
        // Create a Gen2 object for String and Integer.
        Gen2<String, Integer> x = new Gen2<String, Integer>("Value is: ", 99);
        System.out.println(x.getob());
        System.out.println(x.getob2());
    }
}


