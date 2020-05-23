package Alishev._Приведение_примитивных_типов_данных;
public class _Автоупаковка_и_Автораспаковка {
    public static void main(String[] args) {
        int x = 5;
        Integer ff = new Integer(89); // эти две инециаллизации идентичны(но так делать
        // не нужно)
        Integer jj = 89; // JAVA сама упакует это число в класс обёртку
        int l = jj; // это автораспаковка
    }
}
