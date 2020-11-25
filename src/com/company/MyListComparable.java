package com.company;

import java.util.ArrayList;

public class MyListComparable<T extends Comparable<T>> {
    private ArrayList<T> list;

    public MyListComparable() {
        list = new ArrayList<T>();
    }

    public int size() {
        return list.size();
    }

    public void add(T element) {
        list.add(element);
    }

    public T get(int index) {
        if (list.isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        return list.get(index);
    }

}
