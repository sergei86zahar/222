package Alishev._Приведение_примитивных_типов_данных;
public class _Класс_обёртки_ {
    public static void main(String[] args) {
        int x = 1;
        /*
        Double, Float, Long, Integer, Short, Byte, Character и Boolean - классы обёртки.

         */
        Integer x2 = new Integer(123);
        Integer.parseInt("456"); //  У обёрток есть много методов. Например этот делает
        // из строки чило
        System.out.println(Integer.parseInt("456"));

    }
}
