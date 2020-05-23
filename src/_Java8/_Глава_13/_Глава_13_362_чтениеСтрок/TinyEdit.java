package _Java8._Глава_13._Глава_13_362_чтениеСтрок;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TinyEdit {
    public static void main(String[] args) throws IOException {
        // создать поток ввода типа BufferedReader используя стандартный поток ввлда
        // System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];
        System.out.println("Введите строки текста");
        System.out.println("Введите 'стоп' для завершения");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("стоп"))
                break;
        }
        System.out.println("\n Содержимое вашего файла: ");
        // вывести текстовые строки
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("стоп"))
                break;
            System.out.println(str[i]);
        }
    }
}
