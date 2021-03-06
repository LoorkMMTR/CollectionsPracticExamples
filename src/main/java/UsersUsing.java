import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsersUsing {
    public static void main (String[] args) {
        List<UserConstructor> usersList = new ArrayList<>();
        usersList.add(new UserConstructor("Вася",15));
        usersList.add(new UserConstructor("Вася",16.5));
        usersList.add(new UserConstructor("Вася","17"));
        usersList.add(new UserConstructor("Женя"));
        System.out.println(usersList);

        List<UserEmployer> employersList = new ArrayList<>();
        employersList.add(new UserEmployer("Таня", 21, "Врач"));
        employersList.add(new UserEmployer("Маша", 44, "Медсестра"));
        employersList.add(new UserEmployer("Катя", 56, "Заведующий отделением"));
        System.out.println(employersList);

        List<UserKidOrOld> kidsList = new ArrayList<>();
        kidsList.add(UserKidOrOld.kid());
        kidsList.add(UserKidOrOld.kid());
        kidsList.add(UserKidOrOld.kid());
        kidsList.add(UserKidOrOld.old());
        System.out.println(kidsList);
    }
}
