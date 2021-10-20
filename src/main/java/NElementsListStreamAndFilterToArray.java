import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NElementsListStreamAndFilterToArray {
    public static void main (String[] args) {
        List<User> nElementsList = new ArrayList<>();
        nElementsList.add(new User("Вася", 22));
        nElementsList.add(new User("Петя", 12));
        nElementsList.add(new User("Коля", 19));
        nElementsList.add(new User("Дима", 56));
        System.out.println("Users list:\n"+nElementsList);

        User[] resultAgeArray = nElementsList.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .toArray(User[]::new);
        System.out.println("Users array sorted by age:\n"+ Arrays.toString(resultAgeArray));
    }
}
//8.  Создать список, из нескольких объектов User. Вывести на экран.
// Используя stream и filter отфильровать список по возрасту.
// Результат сохранить в массив. Вывести на экран.