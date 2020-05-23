package _Java8._Глава_12._Глава_12_330_Автоупаковка;
public class AutoBox2 {
    // принять параметр типа Integer и возвратить значение типа int
    static int m(Integer v) {
        return v;  // автораспаковка значения типа int
    }
    public static void main(String[] args) {
        /*
        передать значение типа int методу m() и присвоить возвращаемое значение объекту
         типа Integer. Здесь значение 100 аргумента автоматически упаковывается в
         объект типа Integer. Возвращаемое значение также упаковывается в объект типа
         Integer.
         */
        Integer X = m(100);
        System.out.println(X);
    }
}

