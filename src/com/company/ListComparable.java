package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListComparable<T extends Comparable<T>> implements Comparator<T> {
    ArrayList<T> list;

    public ListComparable() {
        list = new ArrayList<>();
    }

    public ListComparable(T[] array) {
        list = new ArrayList<>();
        Collections.addAll(list, array);
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


    public T getLargest() {
        if (list.isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        return list.stream().max(this::compare).get();
    }

    public T getSmallest() {
        if (list.isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        return list.stream().min(this::compare).get();
    }

    @Override
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}
