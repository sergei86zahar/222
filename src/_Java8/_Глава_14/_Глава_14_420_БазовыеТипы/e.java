package _Java8._Глава_14._Глава_14_420_БазовыеТипы;
// Demonstrate a raw type.
class Gen<T> {
    T ob; // передать конс труктору ссылку на объект типа Т
    Gen(T a) {
        ob = a;
    }
    // Return ob.
    T getob() {
        return ob;
    }
}
// Demonstrate raw type.
class RawDemo {
    public static void main(String args[]) {
        // Create a Gen object for Integers.
        Gen<Integer> iOb = new Gen<Integer>(88);
        // Create a Gen object for Strings.
        Gen<String> strOb = new Gen<String>("Generics Test");
        // создать объект базового типа Gen и присвоить ему значение типа DouЫe
        Gen raw = new Gen(98.6);
        // Требуе тся приведение типо в, поскольку тип неизвестен
        double d = (Double) raw.getob();
        System.out.println("value: " + d);
        // Прииенение 6азовых типов может вызвать исключения во время выполнения.  Ниже
        // представлены некоторые тому примеры. Следующее приведение типов вызовет
        // ошибку во время выполнени я!
        //    int i = (Integer) raw.getob(); // run-time error
        // This assigment overrides type safety.
        strOb = raw; // Верно , но поте нциал ьно ошибочно
        //    String str = strOb.getob(); // run-time error
        // Следующее присваивание также нарушает типовую безопасность
        raw = iOb; // OK, but potentially wrong
        //    d = (Double) raw.getob(); // run-time error
    }
}

