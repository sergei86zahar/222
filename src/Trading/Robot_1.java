package Trading;
public class Robot_1 {
    public static void main(String[] args) {
        double[] dayResult = {50, 50, 50, -5, -5,-4,-6,50};
        int i;
        double money = 2000;
        for (i = 0; i < dayResult.length; i++) {
            dayResult[i] = dayResult[i] / 100;
        }
        for (i=0;i<dayResult.length; i++){
            if (dayResult[i]>0) {
                money = money * dayResult[i] + money;
            }
        }
        System.out.println(money);
    }
}
