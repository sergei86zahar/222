package _Java8._Глава_15._456;
public interface MyFunc<T> {
    boolean func(T v1, T v2);
}
class HighTemp {
    private int hTemp;
    HighTemp(int ht) {
        hTemp = ht;
    }
    boolean sameTemp(HighTemp ht2) { return hTemp == ht2.hTemp;
    }
    boolean lessThanTemp(HighTemp ht2) { return hTemp < ht2.hTemp;
    }
}
class Ops {
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int X;
        HighTemp[] weekDayHighs = {new HighTemp(89), new HighTemp(82),
                new HighTemp(90), new HighTemp(89), new HighTemp(89),  new HighTemp(91)
                , new HighTemp(84), new HighTemp(83)};
        X = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Дней, когда максимальная температура была 89: " + X);
        HighTemp[] weekDayHighs2 = {new HighTemp(32), new HighTemp(12),
                new HighTemp(24), new HighTemp(19), new HighTemp(18),  new HighTemp(12)
                , new HighTemp(-1), new HighTemp(13)};
        X = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println("Дней, когда максимальная температура была 12: " + X);
        X = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println("Дней, когда максимальная температура была меньше 89: " + X);
        X = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println("Дней, когда максимальная температура была меньше 19: " + X);
    }
}
