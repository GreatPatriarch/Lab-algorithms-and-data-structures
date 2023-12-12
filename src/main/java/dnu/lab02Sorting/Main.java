package dnu.lab02Sorting;

import dnu.lab02Sorting.factory.SorterFactory;
import dnu.lab02Sorting.factory.SortingType;
import dnu.lab02Sorting.sorters.Sorted;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int[] elementCounts = { 10, 1000, 10000, 1000000 };

        for (int elementCount : elementCounts) {
            List<Integer> list = generateRandomList(random, elementCount);
            for (SortingType type : SortingType.values()) {
                Sorted sorter = SorterFactory.SortFactory(type);
                measureAndSort(sorter, new ArrayList<>(list),
                        String.format("%s - %d elements", type.name(), elementCount));
            }
        }
    }

    private static List<Integer> generateRandomList(Random random, int size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100000));
        }
        return list;
    }

    private static void measureAndSort(Sorted sorter, List<Integer> list, String message) {
        long startTime = System.nanoTime();
        sorter.sort(list);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.printf("%s took %d nanoseconds \n", message, duration);
    }
}
