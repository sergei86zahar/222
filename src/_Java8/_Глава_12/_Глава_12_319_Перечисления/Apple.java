package _Java8._Глава_12._Глава_12_319_Перечисления;
public enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        // вывести значение перечислимого типа
        System.out.println(" Знaчeниe ар : " + ap);
        System.out.println();
        ap = Apple.GoldenDel;
        // сравнить два значения перечислимого типа
        if (ap == Apple.GoldenDel) {
            System.out.println(" Пepeмeннaя ар содержит GoldenDel . \n ");
        }
        // применить перечисление для управления оператором switch
        switch (ap) {
            case Jonathan:
                System.out.println(" Copт Jonathan красный . ");
                break;
            case GoldenDel:
                System.out.println(" Copт Golden Delicious желтый . ");
                break;
            case RedDel:
                System.out.println(" Copт RedDelicious красный . ");
                break;
            case Winesap:
                System.out.println(" Copт Winesap красный . ");
                break;
            case Cortland:
                System.out.println("Copт Cortland красный . ");
                break;
        }
    }
}
