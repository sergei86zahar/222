package _Java8._Глава_13._Глава_13_366_чтениеИзаписьВфайлы;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        // сначала убедиться , что имя файла указано
        if (args.length != 1) {
            System.out.println("Иcпoльзoвaниe : ShowFile TTT.txt");
            return;
        }
        // Попытка от крыть файл
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Heвoзмoжнo открыть файл");
            return;
        }
        // Теперь файл открыт и готов к чтению. Далее из него читаются символы да тех
        // пор, пока не встретится признак крнца файла
        try {
            do {
                i = fin.read();
                if (i != -1)
                    System.out.println((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ооибка чтения из файла");
        }
        // закрыть файл
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("ошибка закрытия файла");
        }
    }
}
