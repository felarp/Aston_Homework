package animals;

public class Animal {
    private static int animalCount = 0;

    Animal() {
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    void run(int distance) {
        System.out.println("Это животное бежит " + distance + " м.");
    }

    void swim(int distance) {
        System.out.println("Это животное плывет " + distance + " м.");
    }
}


