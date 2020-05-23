package _Java8._Глава_8._Глава_8_ПереопределениеМетодов_1;
public class FindAreas {
    public static void main(String[] args) {
        // Использование полиморфизма времени выполнения
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;
        figref = r;
        System.out.println("Площадь равна " + figref.area());
        figref = t;
        System.out.println("Площадь равна " + figref.area());
        figref = f;
        System.out.println("Площадь равна " + figref.area());
    }
}
class Figure {
    double dim1;
    double dim2;
    Figure (double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    double area () {
        System.out.println("Площадь Figure не определена");
        return 0;
    }
}
class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a,b);
    }
    // переопределить area для прямоугольника
    double area() {
        System.out.println("Внутри Area для Rectangle.");
        return dim1 * dim2;
    }
}
class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a,b);
    }
    // переопределить area для прямоугольного треугольника
    double area() {
        System.out.println("Внутри Area для Triangle.");
        return dim1*dim2/2;
    }
}

