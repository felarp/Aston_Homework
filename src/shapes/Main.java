package shapes;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5, "Красный", "Черный"),
                new Rectangle(4, 6, "Синий", "Зеленый"),
                new Triangle(3, 4, 5, "Желтый", "Фиолетовый")
        };

        for (Shape shape : shapes) {
            shape.displayCharacteristics();
        }
    }
}

