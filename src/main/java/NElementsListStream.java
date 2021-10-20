import java.util.*;

public class NElementsListStream {
    public static void main (String[] args) {
        List<User> nElementsList = new ArrayList<>();
        nElementsList.add(new User("Вася", 22));
        nElementsList.add(new User("Петя", 12));
        nElementsList.add(new User("Коля", 19));
        nElementsList.add(new User("Дима", 56));
        System.out.println("Users list:\n"+nElementsList);

        double avgAge = nElementsList.stream().mapToInt(User::getAge).average().orElseThrow();
        int maxAge = nElementsList.stream().mapToInt(User::getAge).max().orElseThrow();
        System.out.println("Average age of the users:\n"+avgAge+"\nOldest user age:\n"+maxAge);
    }
}
//6. Создать список, из нескольких объектов User. Вывести на экран.
// Используя стрим и его функции найти средний, максимальный возраст пользователей. Вывести их на экран
