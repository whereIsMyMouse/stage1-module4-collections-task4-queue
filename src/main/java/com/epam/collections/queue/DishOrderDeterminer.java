package com.epam.collections.queue;


import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        LinkedList<Integer> temp = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            temp.offer(i);
        }
        List<Integer> eat = new ArrayList<>();
        int step = 1;
        while (temp.size() > 0){
            if (step != everyDishNumberToEat){
               int current = temp.poll();
                temp.addLast(current);
                step++;
            } else {
                eat.add(temp.poll());
                step = 1;
            }
        }
        return eat;
    }
}
