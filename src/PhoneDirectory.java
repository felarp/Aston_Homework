import java.util.*;

public class PhoneDirectory {
    private final Map<String, List<String>> directory = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        directory.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return directory.getOrDefault(surname, Collections.emptyList());
    }

    public static void main(String[] args) {
        PhoneDirectory directory = new PhoneDirectory();
        directory.add("Иванов", "123456");
        directory.add("Петров", "654321");
        directory.add("Иванов", "987654");

        System.out.println("Телефоны Иванова: " + directory.get("Иванов"));
        System.out.println("Телефоны Петрова: " + directory.get("Петров"));
    }
}

