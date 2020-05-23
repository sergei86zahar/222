package _Java8._Глава_10._Глава_10_операторы_try_catch_248;
import java.util.Random;
public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();
        /*
        Например, в следующей программе каждая итерация цикла for получает два
        случайных целых числа. Они делятся друг на друга, и их частное используется для
         деления значения 12 345. Конечный результат помещается в переменную а.
         Если любая операция деления приводит к ошибке деления на нуль, она перехватывается,
         значение сбрасывается в нуль, и программа продолжается.
         */
        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
                a = 0;    // сбросить в ноль и продолжить
            }
            System.out.println("a: " + a);
        }
    }
}
