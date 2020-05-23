package Учить._Глава_13_Чтение;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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
