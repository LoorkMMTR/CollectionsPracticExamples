import java.util.ArrayList;
import java.util.List;

public class NElementsListWithFor {
    public static void main (String[] args) {
        int ageLimit = 20;
        List<User> nElementsList = new ArrayList<>();
        nElementsList.add(new User("Вася", 22));
        nElementsList.add(new User("Петя", 12));
        nElementsList.add(new User("Коля", 19));
        nElementsList.add(new User("Дима", 56));
        System.out.println("Users list:\n" + nElementsList);

        System.out.println("Show users older than " + ageLimit + " years:");
        for (int i = 0; i < nElementsList.size(); i++) {
            User user = nElementsList.get(i);
            if (user.getAge() > ageLimit) System.out.println(user);
        }
    }
}