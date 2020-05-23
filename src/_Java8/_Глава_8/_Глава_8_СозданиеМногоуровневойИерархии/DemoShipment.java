package _Java8._Глава_8._Глава_8_СозданиеМногоуровневойИерархии;
public class DemoShipment{
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = shipment1.volume();
        System.out.println("Объём shipment1 равен " + vol);
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость отгрузки: " + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Объём shipment2 равен " + vol);
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость отгрузки: " + shipment2.cost);
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
// добавить стоимость отгрузки
class Shipment extends BoxWeight {
    double cost;
    // построить клон объекта
    Shipment(Shipment ob) { // передать объект конструктору
    super(ob);
    cost = ob.cost;
    }
    // конструктор для всех специализированных параметров
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m); // вызвать конструктор суперкласса
        cost = c;
    }
    // конструктор по-умолчанию
    Shipment() {
        super();
        cost = -1;
    }
    // для куба
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }

}



