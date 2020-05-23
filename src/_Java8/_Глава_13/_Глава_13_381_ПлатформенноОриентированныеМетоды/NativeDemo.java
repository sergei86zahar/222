package _Java8._Глава_13._Глава_13_381_ПлатформенноОриентированныеМетоды;
public class NativeDemo {
    int i;
    public static void main(String[] args) {
        NativeDemo ob = new NativeDemo();
        ob.i = 10;
        System.out.println("Содержимое переменной ob.i перед вызовом " + "платформенно-ориентированного метода: " + ob.i);
        ob.test(); // вызвать платформенно-ориентированный метод
        System.out.println("Содержимое переменной ob.i после вызова " + "платформенно-ориентированного метода: " + ob.i);
    }
    // объявить платформенно-ориентированный метод
    public native void test();
    // загрузить библиотеку DLL, содержащую статический метод
    static {
        System.loadLibrary("NativeDemo");
    }
}
