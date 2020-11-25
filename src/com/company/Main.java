package com.company;


public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        MyList<Short> shorts = new MyList<>();
        shorts.add((short) 12);
        shorts.add((short) 1);
        shorts.add((short) 4);
        shorts.add((short) 28);
        System.out.println("The smallest from shorts is " + shorts.getSmallest());
        System.out.println("The largest from shorts is " + shorts.getLargest());

        MyList<Long> longs = new MyList<>();
        longs.add(456L);
        longs.add(47L);
        longs.add(6L);
        longs.add(325L);
        long smallest = longs.getSmallest();
        System.out.println("The smallest from longs are " + smallest);
        System.out.println("The largest from longs are " + longs.getLargest());
        System.out.println();

        System.out.println("Task 2");
        MyListComparable<String> strings = new MyListComparable<>();
        strings.add("abc");
        strings.add("cd");
        strings.add("ef");
        strings.add("g");
        System.out.println("List of String: ");
        for (int i = 0; i < strings.size(); i++) {
            System.out.print(strings.get(i) + " ");
        }

        MyListComparable<Integer> integers = new MyListComparable<>();
        integers.add(45);
        integers.add(14);
        integers.add(17);
        System.out.println("\nList of Integers: ");
        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) + " ");
        }
        System.out.println("\n");

        System.out.println("Task 3");
        String[] stringArray = {"mem", "dark", "orange", "ball"};
        ListComparable<String> stringList = new ListComparable<>(stringArray);
        System.out.println("The smallest from strings are " + stringList.getSmallest());
        System.out.println("The largest from strings are " + stringList.getLargest());
        Double[] doubleArray = {-4.0, 0.25, 74.3, 26.0};
        ListComparable<Double> doubleList = new ListComparable<>(doubleArray);
        System.out.println("The smallest from doubles are " + doubleList.getSmallest());
        System.out.println("The largest from doubles are " + doubleList.getLargest());


    }
}
