package _Java8._Глава_13._Глава_13_364_ЧтениеИзаписьВфайлы.ДмитрийКанунников.ЧтениеИзФайла_1;
import java.io.DataInputStream;
import java.io.FileInputStream;
public class Test1 {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream("file.txt"));
        byte[] buffer = new byte[100];
        while (dis.available() != 0) {   // ищим доступные байты
            int count = dis.read(buffer);
            if (count>0) {
                System.out.println(new String(buffer));
            }

        }

    }
}
