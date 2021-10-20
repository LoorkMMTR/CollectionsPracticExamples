import java.util.HashMap;
import java.util.Map;

public class MapCreation {
    public static void main(String[] args) {
        Map<String,Integer> usersMap = new HashMap<>();
        usersMap.put("Вася", 22);
        usersMap.put("Петя", 11);
        usersMap.put("Коля", 19);
        usersMap.put("Федя", 88);
        System.out.println("Users map:\n"+usersMap);
    }
}
//10. Создать Map (name -> age). Ключом должно являться имя, а значением возраст пользователя. Добавить несколько значений, вывести на экран.