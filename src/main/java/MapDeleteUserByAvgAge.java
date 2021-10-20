import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class MapDeleteUserByAvgAge {
    public static void main(String[] args) {
        Map<String, Integer> usersMap = new HashMap<>();
        usersMap.put("Вася", 22);
        usersMap.put("Петя", 11);
        usersMap.put("Коля", 19);
        usersMap.put("Федя", 88);
        usersMap.put("Женя", 56);
        System.out.println("Users map before:\n"+usersMap);

        double avgAge = usersMap.values().stream()
                .mapToInt(v -> v)
                .average()
                .orElseThrow();
        System.out.println("Average age of users:\n"+avgAge);

//        for(Iterator <String> iterator = usersMap.keySet().iterator(); iterator.hasNext(); ) {
//            String key = iterator.next();
//            if(usersMap.get(key) < avgAge) { iterator.remove(); }
//        }

        usersMap.values().removeIf(v -> v < avgAge);
        System.out.println("Users map after:\n" + usersMap);
    }
}
//12. То же что в 11 задаче, но удалить все записи с возрастом меньше среднего.
