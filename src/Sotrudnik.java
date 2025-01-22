import static java.lang.System.*;

public class Sotrudnik {
    private final String fullName;
    private final String position;
    private final String email;
    private final String number;
    private final double salary;
    private final int age;

    public Sotrudnik(String fullName, String position, String email, String number, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        out.printf("Имя: %s, Должность: %s, Email: %s, Телефон: %s, Зарплата: %.2f, Возраст: %d%n",
                fullName, position, email, number, salary, age);
    }

    public static void main(String[] args) {
        new Sotrudnik("Иванов Иван Петрович",
                "Тестировщик",
                "ivanov@mail.ru",
                "+79853451234",
                55000.5,
                36  ).printInfo();

    }
}
