package _Java8._Глава_12._Глава_12_329_Автоупаковка;
public class AutoBox {
    public static void main(String[] args) {
        Integer X = 100;  // автоупаковка значения типа int
        int i = X;  // автораспаковка значения типа int
        System.out.println(i + " " + X); // выводит значения 100 и 100
    }
}
