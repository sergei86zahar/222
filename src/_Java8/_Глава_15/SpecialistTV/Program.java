package _Java8._Глава_15.SpecialistTV;
import java.util.ArrayList;
import java.util.List;
public class Program {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Radio radio = new Radio();
        Lamp lamp = new Lamp();
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);
        sw.addElectricityListener(new Electricity() {
            @Override
            public void electricityOn() {
                System.out.println("Пожар");
            }
        });
        sw.addElectricityListener(() -> System.out.println("Пожар"));
        sw.switchOn();
    }
}
class Switcher {
    private List<Electricity> cons = new ArrayList<>();
    void addElectricityListener(Electricity listener) {
        cons.add(listener);
    }
    void removeElectricityListener(Electricity listener) {
        cons.remove(listener);
    }
    public void switchOn() {
        System.out.println("Выключатель включён");
        // if (cons != null) {
        //      cons.electricityOn();
        // }
        for (Electricity c : cons) {
            c.electricityOn();
        }
    }
}
class Lamp implements Electricity {
    public void lightOn() {
        System.out.println("Лампа зажглась");
    }
    @Override
    public void electricityOn() {
        lightOn();
    }
}
class Radio implements Electricity {
    public void playMusic() {
        System.out.println("Радио заиграло");
    }
    @Override
    public void electricityOn() {
        playMusic();
    }
}
@FunctionalInterface
interface Electricity {
    void electricityOn();
}
