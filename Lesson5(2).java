import java.util.*;

public class EmployeeCount {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
        );

        Map<String, Integer> nameCount = new HashMap<>();
        for (String employee : employees) {
            String[] parts = employee.split(" ");
            String name = parts[0];
            Integer count = nameCount.get(name);
            if (count == null) {
                count = 0;
            }
            nameCount.put(name, count + 1);
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(nameCount.entrySet());
        sortedEntries.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
