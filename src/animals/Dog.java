package animals;

public class Dog extends Animal {
    private static int dogCount = 0;

    Dog() {
        dogCount++;
    }
    public static int getDogCount() {
        return dogCount;
    }

    @Override
    void run(int distance) {
        System.out.println(distance > 500
                ? "Собака не может пробежать больше 500 м."
                : "Собака пробежала " + distance + " м.");
    }
    @Override
    void swim(int distance) {
        System.out.println(distance > 10
                ? "Собака не может проплыть больше 10 м."
                : "Собака проплыла " + distance + " м.");
    }
}

