package Alishev._Параметризация;
import java.util.ArrayList;
import java.util.List;
public class Test {
    public static void main(String[] args) {
        //////////////// Java 5 ////////////////////////////
        List animals = new ArrayList();// Динамический массив.
        animals.add("cat");
        animals.add("dog");//1
        animals.add("frog");
        String animal = (String) animals.get(1);// Из объекта извлекаем строки
        ///////////////////// С появлением дженероиков ////////////////////
        /*
        В < > скобках мв помещаем тот пип данных который будем заносить в класс ArrayList
         */
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        String fff = animals2.get(1);
        ////////////// JAVA 7 ////////////////////////////////////
        List<String> gggg = new ArrayList<>();//  Можно справа не указывать тип данных.
    }
}
