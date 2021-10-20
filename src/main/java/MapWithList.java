import java.util.*;

public class MapWithList {
    public static void main(String[] args) {
        Map<Integer, List<String>> namesByAgesMap = new HashMap<>();
        namesByAgesMap.put(14, Arrays.asList("Коля", "Вася", "Федя", "Коля"));
        namesByAgesMap.put(21, Arrays.asList("Петя", "Катя", "Маша", "Вася"));
        System.out.println(namesByAgesMap);
    }
}
//13. Создать мапу age -> NAMES. Ключом является возраст. Значением - список имен (людей с таким возрастом).
// Добавить несколько записей. Должны быть люди с одинаковым возрастом. Вывести на экран.
