import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NElementsListStreamAndFilter {
    public static void main (String[] args) {
        List<User> nElementsList = new ArrayList<>();
        nElementsList.add(new User("Вася", 22));
        nElementsList.add(new User("Петя", 12));
        nElementsList.add(new User("Коля", 19));
        nElementsList.add(new User("Дима", 56));
        System.out.println("Users list:\n"+nElementsList);

        List<User> resultUserList = nElementsList.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
        System.out.println("Users list sorted by age:\n"+resultUserList);
    }
}
//7.  Создать список, из нескольких объектов User. Вывести на экран.
// Используя stream и filter отфильровать список по возрасту.
// Результат сохранить в новый список. Вывести на экран.
