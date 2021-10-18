

import java.io.IOException;
import java.util.*;

public class NElementsList {

    public static void main (String[] args) throws IOException {
        List<User> nElementsList = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int i = 1, j = 1;

        System.out.println("Введите общее количество элементов списка 'N'");
        int n = s.nextInt();
        Integer[] ageArray = new Integer[n/2];
        String[] nameArray = new String[n/2];

        while (i < n) {
            System.out.println("Введите параметры "+j+"-го пользователя");
            System.out.println("Введите Имя пользователя");
            nameArray[j-1] = s.next();
            System.out.println("Введите Возраст пользователя");
            ageArray[j-1] = s.nextInt();
            i+=2;
            j++;
        }
        s.close();

        Collections.addAll(nElementsList);
        System.out.println("Весь список: "+nElementsList);
    }


}
