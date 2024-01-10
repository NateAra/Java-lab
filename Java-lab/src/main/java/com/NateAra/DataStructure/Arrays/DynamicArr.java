package com.NateAra.DataStructure.Arrays;

import java.util.ArrayList;

public class DynamicArr {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.remove(0);
        System.out.println(list.lastIndexOf(30));
        System.out.println(list.contains(20));
        System.out.println(list);
    }
}
