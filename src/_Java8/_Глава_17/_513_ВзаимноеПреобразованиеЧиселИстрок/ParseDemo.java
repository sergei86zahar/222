package _Java8._Глава_17._513_ВзаимноеПреобразованиеЧиселИстрок;
/* Эта программа суммирует ряд целых чисел, вводимых польз ователем. Она преобразует
 строковое представление  каждого числа в целое значение методом parseInt()
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ParseDemo {
    public static void main(String args[]) throws IOException {
        // создать буферизированный поток чтения типа BufferedReader ,
        // используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i;
        int sum = 0;
        System.out.println("Enter numbers, 0 to quit.");
        do {
            str = br.readLine();
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Invalid format");
                i = 0;
            }
            sum += i;
            System.out.println("Current sum is: " + sum);
        } while (i != 0);
    }
}
