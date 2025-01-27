package shapes;

public interface Shape {
    String getName();
    double getPerimeter();
    double getArea();
    String getFillColor();
    String getBorderColor();

    default void displayCharacteristics() {
        System.out.println("Фигура: " + getName() + " [Периметр: " + getPerimeter() +
                ", Площадь: " + getArea() + ", Цвет фона: " + getFillColor() +
                ", Цвет границы: " + getBorderColor() + "]");
    }
}

