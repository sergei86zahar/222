package _Java8._Глава_15._459;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class MyClass {
    private int val;
    MyClass(int v) {
        val = v;
    }
    int getVal() {
        return val;
    }
}
class UseMethodRef {
    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }
    public static void main(String[] args) {
        ArrayList<MyClass> al = new ArrayList<MyClass>();
        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(2));
        al.add(new MyClass(9));
        al.add(new MyClass(3));
        al.add(new MyClass(7));
        MyClass maxValObj = Collections.max(al, UseMethodRef::compareMC);
        System.out.println("Максимальное значение равно: " + maxValObj.getVal());
    }
}
