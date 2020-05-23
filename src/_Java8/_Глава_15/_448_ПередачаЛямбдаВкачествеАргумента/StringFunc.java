package _Java8._Глава_15._448_ПередачаЛямбдаВкачествеАргумента;
public interface StringFunc {  // Функциональный интерфейс
    String func(String n);
}
class LLL {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Лямбда-вырадения повышают эффективность Java";
        String outStr;
        System.out.println("Это исходная строка: " + inStr);
        outStr = stringOp((s) -> s.toUpperCase(), inStr);  // в качестве аргумента
        // данному методу передается простое лямбда-выражение
        System.out.println("Это строка в верхнем регистре: " + outStr);
        outStr = stringOp((str) -> {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr);
        System.out.println("Это строка с удалёнными: " + outStr);
        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Это обращённая строка: " + stringOp(reverse, inStr));
    }
}
