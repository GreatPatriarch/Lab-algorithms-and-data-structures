package dnu.lab02Sorting.sorters;

import java.util.ArrayList;
import java.util.List;

public class QuickSorter implements Sorted {
    @Override
    public List<Integer> sort(List<Integer> array) {
        List<Integer> copy = new ArrayList<>(array);
        quickSort(copy, 0, copy.size() - 1);
        return copy;
    }

    private void quickSort(List<Integer> list, int low, int high) {
        if (list.isEmpty() || low >= high) return;

        int middle = low + (high - low) / 2;
        int border = list.get(middle);

        int i = low, j = high;
        while (i <= j) {
            while (list.get(i) < border) i++;
            while (list.get(j) > border) j--;
            if (i <= j) {
                int swap = list.get(i);
                list.set(i, list.get(j));
                list.set(j, swap);
                i++;
                j--;
            }
        }
        if (low < j) quickSort(list, low, j);
        if (high > i) quickSort(list, i, high);
    }
}