import java.util.ArrayList;
import java.util.List;

public class NElementsListWithForEach {
    public static void main (String[] args) {
        int ageLimit = 50;
        List<User> nElementsList = new ArrayList<>();
        nElementsList.add(new User("Вася", 22));
        nElementsList.add(new User("Петя", 12));
        nElementsList.add(new User("Коля", 19));
        nElementsList.add(new User("Дима", 56));
        System.out.println("Users list:\n" + nElementsList);

        System.out.println("Users list after deleting users younger "+ ageLimit +" years:");
        nElementsList.removeIf(user -> user.getAge() < ageLimit);
        System.out.println(nElementsList);
    }
}
