package dnu.lab02Sorting.sorters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSorter implements Sorted {
    @Override
    public List<Integer> sort(List<Integer> array) {
        List<Integer> buffer1 = new ArrayList<>(array);
        List<Integer> buffer2 = new ArrayList<>(Collections.nCopies(array.size(), 0));
        return mergeSortInner(buffer1, buffer2, 0, array.size());
    }

    public static List<Integer> mergeSortInner(List<Integer> buffer1, List<Integer> buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        List<Integer> sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        List<Integer> sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        List<Integer> result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result.set(destIndex++, sorted1.get(index1) < sorted2.get(index2)
                    ? sorted1.get(index1++) : sorted2.get(index2++));
        }
        while (index1 < middle) {
            result.set(destIndex++, sorted1.get(index1++));
        }
        while (index2 < endIndex) {
            result.set(destIndex++, sorted2.get(index2++));
        }
        return result;
    }
}
