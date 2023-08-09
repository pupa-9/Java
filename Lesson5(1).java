import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        text = text.toLowerCase(); // приводим к нижнему регистру
        String[] words = text.split("[^а-яА-ЯёЁ]+"); // разбиваем текст на слова

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                Integer count = wordCount.get(word);
                if (count == null) {
                    count = 0;
                }
                wordCount.put(word, count + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
