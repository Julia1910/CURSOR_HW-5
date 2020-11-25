package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class MyList<T extends Number> {
    private ArrayList<T> list;

    public MyList() {
        list = new ArrayList<T>();
    }

    public void add(T element) {
        list.add(element);
    }

    public T get(int index) {
        if (list.isEmpty()) {
            System.out.println("Your list is empty");
            return null;
        }
        return list.get(index);
    }

    public T getLargest() {
        if (list.isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        return (T) list.stream().max(Comparator.comparing(Number::doubleValue)).get();
    }

    public T getSmallest() {
        if (list.isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        return (T) list.stream().min(Comparator.comparing(Number::doubleValue)).get();
    }
}
