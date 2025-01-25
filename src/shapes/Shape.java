package shapes;

public interface Shape {

    default double calculateArea() {
        throw new UnsupportedOperationException("Площадь не определена для данной фигуры");
    }

    default double calculatePerimeter() {
        throw new UnsupportedOperationException("Периметр не определен для данной фигуры");
    }

    default void displayInfo(String fillColor, String borderColor) {
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Цвет заливки: " + fillColor);
        System.out.println("Цвет границы: " + borderColor);
        System.out.println("----------------------------");
    }
}

