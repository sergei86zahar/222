package _Java8._Глава_13._Глава_13_364_ЧтениеИзаписьВфайлы.Sanchellios_Prog.Запись1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        File myFile = new File("text.txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(myFile, true));  //
            // будем использовать буфер для увеличения скорости программы.
            // добавили true чтобы добавлять текст
            writer.write("Hello world! Again...\n");
            writer.flush(); // освободить буфер до его заполнения
            writer.close();
        } catch (IOException f) {
            f.printStackTrace();
        }
    }
}
