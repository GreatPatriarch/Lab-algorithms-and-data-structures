package dnu.lab01task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ComparingArrayListWithLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        fillList(arrayList, 100000);
        fillList(linkedList, 100000);

        randomAccess(arrayList, 40000);
        randomAccess(linkedList, 40000);

        sequentialAccess(arrayList);
        sequentialAccess(linkedList);

        insertFirst(arrayList, 10000);
        insertFirst(linkedList,10000);

        insertLast(arrayList, 10000);
        insertLast(linkedList,10000);

        insertMiddle(arrayList, 500, 10000);
        insertMiddle(linkedList,500, 10000);
    }

    public static void fillList(List<Integer> list, int numberOfElements) {
        var start = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(i);
        }
        var end = System.nanoTime();
        var time = end - start;
        if (list instanceof ArrayList) {
            System.out.println("ArrayList was filled in " + time + " nanoseconds");
        } else {
            System.out.println("LinkedList was filled in " + time + " nanoseconds");
        }
    }

    public static void randomAccess(List<Integer> list, int index) {
        var start = System.nanoTime();
        var result = list.get(index);
        var end = System.nanoTime();
        var time = end - start;
        if (list instanceof ArrayList) {
            System.out.println("ArrayList got the number" + result + " on the index for  " + time + " nanoseconds");
        } else {
            System.out.println("LinkedList got the number" + result + " on the index for  " + time + " nanoseconds");
        }
    }

    public static void sequentialAccess(List<Integer> list) {
        var start = System.nanoTime();
        for (int number : list) {
            int temp = number;
        }
        var end = System.nanoTime();
        var time = end - start;
        if (list instanceof ArrayList) {
            System.out.println("ArrayList went through the entire array in  " + time + " nanoseconds");
        } else {
            System.out.println("LinkedList went through the entire array in  " + time + " nanoseconds");
        }
    }

    private static final Random random = new Random();

    public static void insertFirst(List<Integer> list, int numberOfElements ) {
        var start = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(0, random.nextInt());
        }
        var end = System.nanoTime();
        var time = end - start;
        if (list instanceof ArrayList) {
            System.out.println("Insert at the start of ArrayList took " + time + " nanoseconds");
        } else {
            System.out.println("Insert at the start of LinkedList took " + time + " nanoseconds");
        }
    }

    public static void insertLast(List<Integer> list, int numberOfElements ) {
        var start = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(random.nextInt());
        }
        var end = System.nanoTime();
        var time = end - start;
        if (list instanceof ArrayList) {
            System.out.println("Insert at the end of ArrayList took " + time + " nanoseconds");
        } else {
            System.out.println("Insert at the end of LinkedList took " + time + " nanoseconds");
        }
    }

    public static void insertMiddle(List<Integer> list, int index, int numberOfElements ) {
        var start = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(index, random.nextInt());
        }
        var end = System.nanoTime();
        var time = end - start;
        if (list instanceof ArrayList) {
            System.out.println("Insert in the middle of ArrayList took " + time + " nanoseconds");
        } else {
            System.out.println("Insert in the middle of LinkedList took " + time + " nanoseconds");
        }
    }
}