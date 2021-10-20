import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NElementsListStreamEditAge {
    public static void main (String[] args) {
        List<User> nElementsList = new ArrayList<>();
        nElementsList.add(new User("Вася", 22));
        nElementsList.add(new User("Петя", 12));
        nElementsList.add(new User("Коля", 19));
        nElementsList.add(new User("Дима", 56));
        System.out.println("Users list before:\n"+nElementsList);

//        nElementsList.forEach(user -> user.setAge(user.getAge()+2));
//        System.out.println("Users list after:\n"+nElementsList);

        nElementsList.forEach(user -> {
            user.setAge(user.getAge() + 2);
            user.setName(user.getName() + " v1");
        });
        System.out.println("Users list after:\n"+nElementsList);
    }
}
//9.  Создать список, из нескольких объектов User. Вывести на экран.
// Используя stream увеличить возраст всех пользователей в 2 раза в исходном списке. Вывести его на экран.