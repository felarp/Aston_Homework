package animals;

public class Plate {
    private int food;

    Plate(int food) {
        this.food = Math.max(food, 0);
        System.out.println("Миска создана с " + this.food + " ед. еды.");
    }

    int getFood() {
        return food;
    }

    void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("Недостаточно еды в миске для уменьшения на " + amount + " ед.");
        }
    }

    void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Добавлено " + amount + " еды. Теперь в миске " + food + " еды.");
        } else {
            System.out.println("Нельзя добавить отрицательное или нулевое количество еды.");
        }
    }
}
