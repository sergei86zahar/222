package _Java8._Глава_15._453_СылкиНаСтатическиеМетоды;
interface Func {
    String func(String n);
}
class MyStringOps {
    static String Mrerrr(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
class MethodRefDemo {
    static String KKU(Func sf, String s) {
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;
        outStr = KKU(MyStringOps::Mrerrr, inStr);
        /*
        В этой строке кода ссылка на статический метод Mrerrr () , объявляемый в классе
        MyStringOps, передается первому аргументу метода KKU () .
И это вполне допустимо, поскольку метод Mrerrr () совместим с функцио·
нальным интерфейсом Func. Следовательно. в выражении MyStringOps :: Mrerrr
вычисляется ссылка на объект того класса, в котором метод Mrerrr () предоставляет
реализацию метода func () из функционального интерфейса Func.
         */
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращённая строка: " + outStr);
    }
}
