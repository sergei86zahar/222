package _Java8._Глава_13._Глава_13_364_ЧтениеИзаписьВфайлы.ВладленВожаев_урок39.Чтение;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

        FileInputStream fin = new FileInputStream("D://hello.txt");
        FileOutputStream fos = new FileOutputStream("D://hello1.txt", true);
        int i = -1;
        while ((i = fin.read()) != -1) {
            System.out.print((char) i);
            char buffer = (char) i;
            fos.write(buffer);
        }
        fin.close();
        fos.close();
    }
}
