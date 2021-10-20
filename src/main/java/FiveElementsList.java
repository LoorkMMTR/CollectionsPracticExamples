import java.util.*;

public class FiveElementsList {
    public static void main (String[] args) {
        Integer[] fiveElementsArray = {1, 2, 3, 4, 5};
        List<Integer> fiveElementsList = new ArrayList<>();

        Collections.addAll(fiveElementsList, fiveElementsArray);
        System.out.println("Added 5 elements array in list: \n"+fiveElementsList);

        fiveElementsList.add(5,6);
        fiveElementsList.remove(0);
        System.out.println("Added last element and deleted first from list:\n"+fiveElementsList);
    }
}
