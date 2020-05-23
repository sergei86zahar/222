package _Java8._Глава_12._Глава_12_324;
public enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        // получить все порядковые значения с помощью метода ordinal()
        System.out.println("Все константы сортов яблок " + " и их порядковые значения: ");
        for (Apple a : Apple.values()) {
            System.out.println(a + " " + a.ordinal());
        }
        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;
        System.out.println();
        // продемонстрировать применение методов compareTo() и equals()
        if (ap.compareTo(ap2) < 0) {
            System.out.println(ap + " предшествует " + ap2);
        }
        if (ap.compareTo(ap2) > 0) {
            System.out.println(ap2 + " предшествует " + ap);
        }
        if (ap.compareTo(ap3) == 0) {
            System.out.println(ap + " равно " + ap3);
        }
        System.out.println();
        if (ap.equals(ap2)) {
            System.out.println("Ошибка!");
        }
        if (ap.equals(ap3)) {
            System.out.println(ap + " равно " + ap3);
        }
        if (ap == ap3) {
            System.out.println(ap + " == " + ap3);
        }
    }
}
