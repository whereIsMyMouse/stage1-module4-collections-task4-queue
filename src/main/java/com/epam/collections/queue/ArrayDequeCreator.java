package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        boolean firstIsNotEmpty = true;
        result.add(firstQueue.poll());
        result.add(firstQueue.poll());
        result.add(secondQueue.poll());
        result.add(secondQueue.poll());
        firstIsNotEmpty = firstQueue.size() == 0 ? false : true;

        if (firstIsNotEmpty) {
            while (firstQueue.size() >= 1) {
                firstQueue.offer(result.pollLast());
                result.add(firstQueue.poll());
                result.add(firstQueue.poll());
                secondQueue.offer(result.pollLast());
                result.add(secondQueue.poll());
                result.add(secondQueue.poll());
            }
        }
        return result;
    }
}
