package _Java8._Глава_14._Глава_14_410_ОграниченныеМетасильныеАргументы;
public class TwoD {
    int x, y;
    TwoD(int a, int b) {
        x = a;
        y = b;
    }
}
class ThreeD extends TwoD {
    int z;
    ThreeD(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}
class FourD extends ThreeD {
    int t;
    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}
// Этот класс хранит массив координатных объектов
class Coords<T extends TwoD> {
    T[] coords;
    Coords(T[] y) {
        coords = y;
    }
    static void showXY(Coords<?> LL) {
        System.out.println("Координаты X Y: ");
        for (int i = 0; i < LL.coords.length; i++) {
            System.out.println(LL.coords[i].x + " " + LL.coords[i].y);
        }
        System.out.println();
    }
    static void showXYZ(Coords<? extends ThreeD> LL) {
        System.out.println("X Y Z Coordinates: ");
        for (int i = 0; i < LL.coords.length; i++) {
            System.out.println(LL.coords[i].x + " " + LL.coords[i].y + " " + LL.coords[i].z);
        }
        System.out.println();
    }
    static void showAll(Coords<? extends FourD> LL) {
        System.out.println("X Y Z T Coordinates: ");
        for (int i = 0; i < LL.coords.length; i++) {
            System.out.println(LL.coords[i].x + " " + LL.coords[i].y + " " + LL.coords[i].z + " " + LL.coords[i].t);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TwoD td[] = {new TwoD(0, 0), new TwoD(7, 9), new TwoD(18, 4), new TwoD(-1, -23)};
        Coords<TwoD> tdlocs = new Coords<TwoD>(td);
        System.out.println("Содержимое объекта tdlocs.");
        showXY(tdlocs); // Верно
        // showXYZ(tdlocs); // Ошибка
        // showAll(tdlocs); // Ошибка
        // а теперь создать несколько объектов типа FourD
        FourD fd[] = {new FourD(1, 2, 3, 4), new FourD(6, 8, 14, 8), new FourD(22, 9, 4, 9), new FourD(3, -2, -23, 17)};
        Coords<FourD> fdlocs = new Coords<FourD>(fd);
        System.out.println("Содержимое объекта fdlocs.");
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}
