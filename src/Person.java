

public class Person {
    private final String fullName, position, email, number;
    private final double salary;
    private final int age;

    public Person(String fullName, String position, String email, String number, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("Имя: %s, Должность: %s, Email: %s, Телефон: %s, Зарплата: %.2f, Возраст: %d%n",
                fullName, position, email, number, salary, age);
    }

    public static void main(String[] args) {
        Person[] staffArray = {
                new Person("Иванов Иван", "Инженер", "ivanov@mail.ru", "892312312", 30000, 30),
                new Person("Петров Петр", "Разработчик", "petrov@mail.ru", "89876543210", 50000, 28),
                new Person("Сидорова Анна", "Аналитик", "sidorova@mail.ru", "8976543210", 55000, 32),
                new Person("Кузнецов Олег", "Менеджер", "kuznetsov@mail.ru", "89991234567", 45000, 40),
                new Person("Федоров Федор", "Администратор", "fedorov@mail.ru", "8912345678", 47000, 29)
        };
        for (Person person : staffArray) {
            person.printInfo();
        }
    }
}


