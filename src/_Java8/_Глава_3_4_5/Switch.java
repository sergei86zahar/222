package _Java8._Глава_3_4_5;
public class Switch {
    public static void main(String[] args) {
        int i = 3;
        switch (i) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
            case 5:
                System.out.println(5);
            default:
                System.out.println("default");
        }
    }
}
