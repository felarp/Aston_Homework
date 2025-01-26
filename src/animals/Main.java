package animals;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(), new Cat(), new Cat()};
        Dog dog = new Dog();

        Plate plate = new Plate(25);

        cats[0].run(150);
        cats[1].run(250);

        dog.run(400);
        dog.swim(5);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate, 10);
            System.out.println("Кот " + (i + 1) + " сыт: " + cats[i].isFull());
        }

        plate.addFood(20);
        cats[2].eat(plate, 15);

        System.out.println("Кот 3 сыт: " + cats[2].isFull());
        System.out.println("\nСтатистика животных:");
        System.out.println("Создано животных: " + Animal.getAnimalCount());
        System.out.println("Создано котов: " + Cat.getCatCount());
        System.out.println("Создано собак: " + Dog.getDogCount());
    }
}