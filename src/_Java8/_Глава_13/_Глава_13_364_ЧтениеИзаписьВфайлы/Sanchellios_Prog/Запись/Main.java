package _Java8._Глава_13._Глава_13_364_ЧтениеИзаписьВфайлы.Sanchellios_Prog.Запись;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("text.txt");  // если такого файла нет,
            // среда создаст его сама в проекте
            writer.write("Hello world! Again...");
            writer.close();
        } catch (IOException f) {
            f.printStackTrace();
        }
    }
}
