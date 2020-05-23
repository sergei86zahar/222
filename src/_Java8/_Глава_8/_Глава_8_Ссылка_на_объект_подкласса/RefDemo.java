package _Java8._Глава_8._Глава_8_Ссылка_на_объект_подкласса;
public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box plainbox = new Box();
        /*
        Здесь weightbox - ссылка на объекты BoxWeight, а plainbox - ссылка на Box-объекты.
        Так как BoxWeight - подкласс Box, допустимо назначить plainbox-ссылку на объект
         weightbox.
         */
        double vol;
        vol = weightbox.volume();
        System.out.println("Объём weightbox равен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println();
        // назначить ссылку на BoxWeight ссылке Box
        plainbox = weightbox;    //    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        vol = plainbox.volume();   // OK, volume() определена в Box
        System.out.println("Объём plainbox равен " + vol);
        /*
        Следующее утверждение не верно, потому что plainbox не определяет член weight.
         */
        //  System.out.println("Вес plainbox равен " + plainbox.weight);
    }
    /*
    Когда ссылка на объект подкласса указывает на ссылочную переменную суперкласса, вы
    будете иметь доступ только к тем частям объекта, которые определены суперклассом.
     */
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

