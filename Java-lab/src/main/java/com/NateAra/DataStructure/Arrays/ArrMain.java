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

        //--------------

        Array number2 = new Array(3);
        number2.insert(7);
        number2.insert(6);
        number2.insert(5);
        number2.insert(4);
        number2.insert(3);

        number2.findCommonItems(number1.getItems(), number2.getItems());
    }
}
