package _Java8._Глава_13._Глава_13_364_ЧтениеИзаписьВфайлы.ДмитрийКанунников.ЧтениеИзФайла_4;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Test4 {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("file.txt")).forEach(System.out::println);
    }
}
