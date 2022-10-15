package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        Queue<String> result = new PriorityQueue<>(new StringComparator());
        for (String firstStrings : firstList) {
            result.add(firstStrings);
        }
        for (String secondStrings : secondList) {
            result.add(secondStrings);
        }
        return (PriorityQueue<String>) result;
    }
}
    class StringComparator implements Comparator<String>{

           @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}
