package _Java8._Глава_13._Глава_13_364_ЧтениеИзаписьВфайлы.ВладленВожаев_урок39.Запись;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        String str = "Hello";
        String str1 = " World!";
        FileOutputStream fos = new FileOutputStream("D://hello.txt",true);  // создать
        // поток для зариси
        byte[] buffer = str.getBytes();  // создать массив байтов и перевести строку в
        // байты
        fos.write(buffer);  // запишим байты в файл
        buffer = str1.getBytes();
        fos.write(buffer);

    }
}
