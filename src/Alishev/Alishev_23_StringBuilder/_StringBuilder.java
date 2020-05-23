package Alishev.Alishev_23_StringBuilder;
public class _StringBuilder {
    public static void main(String[] args) {
        StringBuilder A = new StringBuilder("Hello");
        System.out.println(A.toString());
        /*
        Класс StringBuilder позволяет не создавая новых объектов "строка" доюавлять к
        уже существующему объекту новые слова.
        Метод append()  позволяет добавлять у объекту StringBuilder новые слова.
        Метод toUpperCase()  делает все буквы заглавными.

         */
        A.append(" my").append(" friend"); // можно у метода вызывать метод
        System.out.println(A.toString());
        System.out.println(A.toString().toUpperCase());
    }
}
