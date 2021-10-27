import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MatcherUsing {

    @Test
    public void checkListOnSorting() {
        List<String> strList = Arrays.asList("Вася", "Аня", "Боря");
//        List<String> strList = Arrays.asList("Аня", "Боря", "Вася");
        assertThat(strList, Matcher.isSorted());
    }

    @Test
    public void checkArrayOnSorting() {
        String[] strArr = {"Вася", "Аня", "Боря"};
        List<String> strList = new ArrayList<>();
        Collections.addAll(strList, strArr);
        assertThat(strList, Matcher.isSorted());
    }
}

