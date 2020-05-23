package _Java8._Глава_13._Глава_13_364_ЧтениеИзаписьВфайлы.ДмитрийКанунников.ЧтениеИзФайла_3;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class Test3 {
    public static void main(String[] args) throws IOException {
        List<String> list = Files.readAllLines(Paths.get("file.txt"));
        for (String item: list) {
            System.out.println(item);
        }
    }
}
