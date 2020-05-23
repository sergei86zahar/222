package _Java8._Глава_8._Глава_8_Наследование_1;
public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Объём mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Объём mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
    }
}
class Box {
    double width;
    double height;
    double depth;
    // создать клон объекта
    Box(Box ob) {  // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // конструктор, используемый, когда указаны все размуры
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // конструктор, используемый, когда размеры не указаны
    Box() {
        width = -1;   // использовать -1 для указания
        height = -1;  // неинициализированного
        depth = -1;   // блока
    }
    // конструктор, используемый для создания куба
    Box(double len) {
        width = height = depth = len;
    }
    // вычислить и вернуть объем
    double volume() {
        return width * height * depth;
    }
}
class BoxWeight extends Box {
    double weight;  // вес блока
    // конструктор для BoxWeight
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

