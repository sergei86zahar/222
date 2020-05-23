package _Java8._Глава_15._456_СсылкиНаМетодыЭкземпляра;
public interface StringFunc {
    String func(String n);
}
class MyStringOps {
    String JKL(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
class MethodRefDemo2 {
    static String Oppp(StringFunc sf, String s) {
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;
        MyStringOps strOps = new MyStringOps();
        outStr = Oppp(strOps::JKL, inStr);
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращённая строка: " + outStr);
    }
}
