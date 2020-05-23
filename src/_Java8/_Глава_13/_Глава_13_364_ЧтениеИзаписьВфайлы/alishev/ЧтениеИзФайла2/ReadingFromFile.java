package _Java8._Глава_13._Глава_13_364_ЧтениеИзаписьВфайлы.alishev.ЧтениеИзФайла2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "file.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");  // метод split() определяет разделитель
        // между значениями, в данном случае это пробел
        int[] numbers = new int[3];
        int counter = 0;
        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number); // метод parseInt() делает
            // из строки число
        }
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}
