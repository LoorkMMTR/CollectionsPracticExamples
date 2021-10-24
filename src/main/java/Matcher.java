import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Matcher {
    public Matcher(List<String> strList) {
    List<String> sortList = strList.stream()
            .sorted()
            .collect(Collectors.toList());
        if (sortList.equals(strList)) { System.out.println("List "+strList+" is sorted"); }
        else { System.out.println("List "+strList+" is not sorted"); }
    }


    public Matcher(String[] strArr) {
        List<String> strList = new ArrayList<>();
        Collections.addAll(strList, strArr);
        List<String> sortList = strList.stream()
                .sorted()
                .collect(Collectors.toList());
        if (sortList.equals(strList)) { System.out.println("Array "+strList+" is sorted"); }
        else { System.out.println("Array "+strList+" is not sorted"); }
    }
}
