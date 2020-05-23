package _Java8._Глава_13._Глава_13_364_ЧтениеИзаписьВфайлы.alishev.ЗаписьВфайл;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file");
        PrintWriter pw = new PrintWriter(file); // запись текста
        pw.println("Test row 1");
        pw.println("Test row 2");
        pw.close();
    }
}
