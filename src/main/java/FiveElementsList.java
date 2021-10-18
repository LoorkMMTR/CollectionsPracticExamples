import java.util.*;

public class FiveElementsList {

    public static void main (String[] args) {
        Integer[] fiveElementsArray = {1, 2, 3, 4, 5};
        List<Integer> fiveElementsList = new ArrayList<Integer>();

        Collections.addAll(fiveElementsList, fiveElementsArray);
        System.out.println("Добавление массива из пяти элементов в список: "+fiveElementsList);
        fiveElementsList.add(5,6);
        fiveElementsList.remove(0);
        System.out.println("Удаление первого элемента из списока: "+fiveElementsList);
    }
}
