import java.util.*;

public class NElementsList {

    public static void main (String[] args) {
        List<User> nElementsList = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Input quality of list elements 'N'");
        int n = s.nextInt();

        for (int i = 0; i < n; i+=2) {
            System.out.println("Input "+(i+2)/2+" user params");
            System.out.println("Input user name");
            String name = s.next();
            System.out.println("Input user age");
            int age = s.nextInt();
            nElementsList.add(new User(name, age));
        }
        s.close();
        System.out.println("Users list:\n"+nElementsList);
    }
}
