package _Java8._Глава_8._Глава_8_АбстрактныйКласс_2;
public class AbstractAreas {
    public static void main(String[] args) {
        // Использование абстрактных методов и классов
        // Figure f = new Figure(10, 10);      // теперь незаконно
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;      // создаём ссылку
        figref = r;
        System.out.println("Площадь равна " + figref.area());
        figref = t;
        System.out.println("Площадь равна " + figref.area());

    }
}
abstract class Figure {
    double dim1;
    double dim2;
    Figure (double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    abstract double area ();
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

