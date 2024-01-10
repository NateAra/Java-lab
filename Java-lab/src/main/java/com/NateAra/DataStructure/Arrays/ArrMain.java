package com.NateAra.DataStructure.Arrays;


public class ArrMain {
    public static void main(String[] args) {
        Array number = new Array(4);

        number.insert(1);
        number.insert(2);
        number.insert(3);
        number.insert(4);

        number.removeAt(0);

        System.out.println(number.indexOf(300));

        number.print();
    }
}
