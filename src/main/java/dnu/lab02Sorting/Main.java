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
        var bubbleSort = SorterFactory.SortFactory(SortingType.BUBBLE);
        var mergeSort = SorterFactory.SortFactory(SortingType.MERGE);
        var quickSort = SorterFactory.SortFactory(SortingType.QUICK);
        var shellSort = SorterFactory.SortFactory(SortingType.SHELL);
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(100));
        }

        List<Integer> cloneListForTen = new ArrayList<>(list1);
        measureAndSort(bubbleSort, cloneListForTen, "Bubble Sort - 10 elements");
        cloneListForTen = new ArrayList<>(list1);
        measureAndSort(mergeSort, cloneListForTen, "Merge Sort - 10 elements");
        cloneListForTen = new ArrayList<>(list1);
        measureAndSort(quickSort, cloneListForTen, "Quick Sort - 10 elements");
        cloneListForTen = new ArrayList<>(list1);
        measureAndSort(shellSort, cloneListForTen, "Shell Sort - 10 elements");

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list2.add(random.nextInt(10000));
        }

        List<Integer> cloneListForThousand = new ArrayList<>(list2);
        measureAndSort(bubbleSort, cloneListForThousand, "Bubble Sort - 1000 elements");
        cloneListForThousand = new ArrayList<>(list2);
        measureAndSort(mergeSort, cloneListForThousand, "Merge Sort - 1000 elements");
        cloneListForThousand = new ArrayList<>(list2);
        measureAndSort(quickSort, cloneListForThousand, "Quick Sort - 1000 elements");
        cloneListForThousand = new ArrayList<>(list2);
        measureAndSort(shellSort, cloneListForThousand, "Shell Sort - 1000 elements");

        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list3.add(random.nextInt(10000));
        }

        List<Integer> cloneListForTenThousand = new ArrayList<>(list3);
        measureAndSort(bubbleSort, cloneListForTenThousand, "Bubble Sort - 100000 elements");
        cloneListForTenThousand = new ArrayList<>(list3);
        measureAndSort(mergeSort, cloneListForTenThousand, "Merge Sort - 100000 elements");
        cloneListForTenThousand = new ArrayList<>(list3);
        measureAndSort(quickSort, cloneListForTenThousand, "Quick Sort - 100000 elements");
        cloneListForTenThousand = new ArrayList<>(list3);
        measureAndSort(shellSort, cloneListForTenThousand, "Shell Sort - 100000 elements");


        List<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list4.add(random.nextInt(10000));
        }

        List<Integer> cloneListForMillion = new ArrayList<>(list4);
        //measureAndSort(bubbleSort, cloneListForMillion, "Bubble Sort - 1000000 elements"); // Я не дождался пока оно его отсортирует
        cloneListForMillion = new ArrayList<>(list4);
        measureAndSort(mergeSort, cloneListForMillion, "Merge Sort - 1000000 elements");
        cloneListForMillion = new ArrayList<>(list4);
        measureAndSort(quickSort, cloneListForMillion, "Quick Sort - 1000000 elements");
        cloneListForMillion = new ArrayList<>(list4);
        measureAndSort(shellSort, cloneListForMillion, "Shell Sort - 1000000 elements");

    }

    private static void measureAndSort(Sorted sorter, List<Integer> list, String message) {
        long startTime = System.nanoTime();
        sorter.sort(list);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.printf("%s took %d nanoseconds \n", message, duration);
    }
}
