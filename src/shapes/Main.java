package shapes;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 7);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Круг:");
        circle.displayInfo("Красный", "Черный");

        System.out.println("Прямоугольник:");
        rectangle.displayInfo("Синий", "Белый");

        System.out.println("Треугольник:");
        triangle.displayInfo("Зеленый", "Желтый");
    }
}

