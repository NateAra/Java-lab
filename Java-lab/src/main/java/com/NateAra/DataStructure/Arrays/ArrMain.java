package com.NateAra.DataStructure.Arrays;


public class ArrMain {
    public static void main(String[] args) {
        Array number1 = new Array(4);

        number1.insert(1);
        number1.insert(1000);
        number1.insert(3);
        number1.insert(4);

        number1.removeAt(0);

        System.out.println(number1.indexOf(300));

        number1.largestItem();

        number.print();

        System.out.println("--------------");
        number.largestItem();
    }
}
