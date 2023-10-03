package dnu.lab02Sorting.sorters;

import java.util.List;

public class BubbleSorter implements Sorted {

    @Override
    public List<Integer> sort(List<Integer> array) {
        Integer temp;
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = 0; j < array.size() - i - 1; j++) {
                if (array.get(j).compareTo(array.get(j + 1)) > 0) {
                    temp = array.get(j + 1);
                    array.set(j + 1, array.get(j));
                    array.set(j, temp);
                }
            }
        }
        return array;
    }
}
