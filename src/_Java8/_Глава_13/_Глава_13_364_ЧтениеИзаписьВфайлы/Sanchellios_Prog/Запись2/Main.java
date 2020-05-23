package _Java8._Глава_13._Глава_13_364_ЧтениеИзаписьВфайлы.Sanchellios_Prog.Запись2;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        File myFile = new File("text.txt");
        try {
            PrintWriter writer =
                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));  //
            // будем использовать буфер для увеличения скорости программы.
            // добавили true чтобы добавлять текст
            writer.write("Hello world! Again...");
            writer.flush(); // освободить буфер до его заполнения
            writer.close();
        } catch (IOException f) {
            f.printStackTrace();
        }
    }
}
