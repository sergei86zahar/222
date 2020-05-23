package _Java8._Глава_3_4_5;
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0) { // если вырожение true выполняется оператор continue и
                // после него ни чего не выполняется, просто срабатывает счетчик и
                // прибавляется еденица к i.
                continue;
            }
            System.out.println("это нечётное число " + i);
        }
    }
}
