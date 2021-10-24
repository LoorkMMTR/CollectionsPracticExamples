import java.util.ArrayList;
import java.util.List;

public class NElementsListStreamEditAge {
    public static void main (String[] args) {
        UserConstructor userForConstructor = new UserConstructor("htrh", 15);
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
        System.out.println(userForConstructor);
    }


}


//9.  Создать список, из нескольких объектов User. Вывести на экран.
// Используя stream увеличить возраст всех пользователей в 2 раза в исходном списке. Вывести его на экран.