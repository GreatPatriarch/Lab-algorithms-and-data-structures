package dnu.lab02Sorting.sorters;

import java.util.ArrayList;
import java.util.List;

public class ShellSorter implements Sorted {
    @Override
    public List<Integer> sort(List<Integer> arrayToSort) {
        List<Integer> list = new ArrayList<>(arrayToSort);
        int n = list.size();

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = list.get(i);
                int j = i;
                while (j >= gap && list.get(j - gap) > key) {
                    list.set(j, list.get(j - gap));
                    j -= gap;
                }
                list.set(j, key);
            }
        }
        return list;
    }
}
