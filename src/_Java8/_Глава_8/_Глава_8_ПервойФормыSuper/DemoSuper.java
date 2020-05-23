package _Java8._Глава_8._Глава_8_ПервойФормыSuper;
public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight(); // по умолчанию
        BoxWeight mycube = new BoxWeight(3,2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Объём mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Объём mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();
        vol = mybox3.volume();
        System.out.println("Объём mybox3 равен " + vol);
        System.out.println("Вес mybox3 равен " + mybox3.weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("Объём myclone равен " + vol);
        System.out.println("Вес myclone равен " + myclone.weight);
        System.out.println();
        vol = mycube.volume();
        System.out.println("Объём mycube равен " + vol);
        System.out.println("Вес mycube равен " + mycube.weight);
        System.out.println();
    }
}
class Box {
    private double width;
    private double height;
    private double depth;
    // создать клон объекта
    Box(Box ob) {  // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // конструктор, используемый, когда указаны все размеры
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
// BoxWeight теперь полностью реализует все конструкторы
class BoxWeight extends Box {
    double weight;  // вес блока
    //построить клон объекта
    BoxWeight(BoxWeight ob) { // передать объект конструктору
        super(ob);
        weight = ob.weight;
    }
    // конструктор для всех размеров
    BoxWeight(double w, double h, double d, double m) {
        super(w,h,d); // вызвать конструктор суперкласса
        weight = m;
    }
    BoxWeight() {
        super();
        weight = -1;
    }
    // для куба
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

