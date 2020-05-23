package _Java8._Глава_15._458_СсылкиНаОбобщённыеМетоды;
public interface MyFunc<T> {
    int func(T[] vals, T v);
}
class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) {
                count++;
            }
        }
        return count;
    }
}
class GenericMethodRefDemo {
    static <T> int myOp(MyFunc<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }
    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"Один", "Два", "Три", "Два"};
        int count;
        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("Массив vals содержит " + count + " числа 4");
        count = myOp(MyArrayOps::<String>countMatching, strs, "Two");
        System.out.println("Массив strs содержит " + count + " числа два");
    }
}
