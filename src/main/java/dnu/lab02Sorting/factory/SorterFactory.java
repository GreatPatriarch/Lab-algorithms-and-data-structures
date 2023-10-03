package dnu.lab02Sorting.factory;

import dnu.lab02Sorting.sorters.*;

public class SorterFactory {
    public static Sorted SortFactory(SortingType type) {
        return switch (type) {
            case BUBBLE -> new BubbleSorter();
            case MERGE -> new MergeSorter();
            case QUICK -> new QuickSorter();
            case SHELL -> new ShellSorter();
        };
    }
}
