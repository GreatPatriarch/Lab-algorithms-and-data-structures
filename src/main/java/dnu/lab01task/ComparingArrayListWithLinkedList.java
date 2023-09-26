package dnu.lab01task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

        insertFirst(arrayList, 120);
        insertFirst(linkedList,120);

        insertLast(arrayList, 240);
        insertLast(linkedList,240);

        insertMiddle(arrayList, 500, 60000);
        insertMiddle(linkedList,500, 60000);
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
            System.out.println("ArrayList got the number on the index for  " + time + " nanoseconds");
        } else {
            System.out.println("LinkedList got the number on the index for  " + time + " nanoseconds");
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

    public static void insertFirst(List<Integer> list, Integer element ) {
        var start = System.nanoTime();
        list.add(0, element);
        var end = System.nanoTime();
        var time = end - start;
        if (list instanceof ArrayList) {
            System.out.println("Insert in the start of ArrayList " + time + " nanoseconds");
        } else {
            System.out.println("Insert in the start of LinkedList " + time + " nanoseconds");
        }
    }

    public static void insertLast(List<Integer> list, Integer element ) {
        var start = System.nanoTime();
        list.add(element);
        var end = System.nanoTime();
        var time = end - start;
        if (list instanceof ArrayList) {
            System.out.println("Insert in the end of ArrayList " + time + " nanoseconds");
        } else {
            System.out.println("Insert in the middle of LinkedList " + time + " nanoseconds");
        }
    }

    public static void insertMiddle(List<Integer> list, Integer element, int index ) {
        var start = System.nanoTime();
        list.add(index, element);
        var end = System.nanoTime();
        var time = end - start;
        if (list instanceof ArrayList) {
            System.out.println("Insert in the middle of ArrayList " + time + " nanoseconds");
        } else {
            System.out.println("Insert in the middle of LinkedList " + time + " nanoseconds");
        }
    }
}