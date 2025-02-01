import java.util.*;

public class UniqueWordsCounter {
    public static void main(String[] args) {
        String[] words = {
                "apple", "banana", "orange", "grape", "apple",
                "banana", "kiwi", "mango", "pear", "kiwi",
                "pineapple", "grape", "melon", "apple", "pear"
        };
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Уникальные слова: " + uniqueWords);
        System.out.println("Количество вхождений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("Слово: " + entry.getKey() + ", Количество: " + entry.getValue());
        }
    }
}


