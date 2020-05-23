package _Java8._Глава_3_4_5;
public class BoxDemo {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);
        double vol;
        vol = myBox1.volume();
        System.out.println("Объём равен " + vol);
        vol = myBox2.volume();
        System.out.println("Объём равен " + vol);
    }
}
