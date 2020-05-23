package _Java8._Глава_12._Глава_12_320;
public enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println(" Константы перечислимого типа Apple : ");
        // применить мерод value()
        // Apple allapples[] = Apple.values();
        for (Apple a : Apple.values()) {
            System.out.println(a);
        }
        System.out.println();
        // применить метод valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("Переменная ap содержит " + ap);
    }
    /*
    Метод values() возвращает массив, содержащий список констант перечислимого
типа. А метод valueOf() возвращает константу перечислимого типа, значение
которой соответствует символьной строке, переданной в качестве аргумента
строка.
     */
}
