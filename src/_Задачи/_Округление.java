package _Задачи;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class _Округление {
    public static void main(String[] args) {
        double a = 458.2759873654;
        BigDecimal bd = new BigDecimal(a).setScale(2, RoundingMode.HALF_EVEN);
        a = bd.doubleValue();
        System.out.println(a);

    }
}
