import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDeleteUserByAge {
    public static void main(String[] args) {
        int limitAge = 11;
        Map<String, Integer> usersMap = new HashMap<>();
        usersMap.put("Вася", 22);
        usersMap.put("Петя", 11);
        usersMap.put("Коля", 19);
        usersMap.put("Федя", 88);
        usersMap.put("Женя", 11);
        System.out.println("Users map before:\n" + usersMap);

//        for(Iterator<String> iterator = usersMap.keySet().iterator(); iterator.hasNext(); ) {
//            String key = iterator.next();
//            if(usersMap.get(key) == limitAge) { iterator.remove(); }
//        }

        usersMap.values().removeIf(value -> value.equals(limitAge));
        System.out.println("Users map after:\n" + usersMap);
    }
}
//11. В мапе из 10 задачи удалить записи с неким возрастом. Вывести мапу на экран.