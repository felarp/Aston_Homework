package animals;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;

    Cat() {
        catCount++;
        isFull = false;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    void run(int distance) {
        System.out.println(distance > 200
                ? "Кот не может пробежать больше 200 м."
                : "Кот пробежал " + distance + " м.");
    }

    void eat(Plate plate, int foodAmount) {
        if (plate.getFood() >= foodAmount) {
            plate.decreaseFood(foodAmount);
            isFull = true;
            System.out.println("Кот поел и наелся.");
        } else {
            System.out.println("Еды в миске мало, кот остался голодным.");
        }
    }

    public boolean isFull() {
        return isFull;
    }
}
