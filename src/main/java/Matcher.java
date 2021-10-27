import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;
import java.util.List;
import java.util.stream.Collectors;

public class Matcher extends TypeSafeDiagnosingMatcher<List<String>> {

    public void describeTo(Description description) {
        description.appendText("List should be sorted");
    }
    @Override
    protected boolean matchesSafely(List<String> strList, Description mismatchDescription) {
        List<String> sortList = strList.stream()
                .sorted()
                .collect(Collectors.toList());

        mismatchDescription.appendText("was ")
                .appendValue(strList)
                .appendText(", isn't sorted list");
        return (sortList.equals(strList));
    }

    public static Matcher isSorted() {
        return new Matcher();
    }
}

