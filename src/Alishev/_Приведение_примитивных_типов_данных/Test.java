package Alishev._Приведение_примитивных_типов_данных;
public class Test {
    public static void main(String[] args) {
        byte x = 123; // -127 до 127
        long y = 123;
        double a = 12.7;
        float q = 12.2f;
        long d = 351651432L; // Нужно ставить букву L вконце, потому что по-умолчаниб
        // это будет int
        long j = 45;
        int g = (int)j; // явное привидение
        float k = (float)123.2;  // явное привидение
        long l = Math.round(a); // округление числа
        System.out.println(l);

    }
}
