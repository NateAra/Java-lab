package com.NateAra.DataStructure.Arrays;


public class ArrMain {
    public static void main(String[] args) {
        Array number1 = new Array(4);

        number1.insert(10);
        number1.insert(20);
        number1.insert(30);
        number1.insert(40);


        number1.removeAt(0);
        System.out.println(number1.indexOf(300));
        number1.largestItem();


        Array number2 = new Array(3);
        number2.insert(70);
        number2.insert(60);
        number2.insert(50);
        number2.insert(40);
        number2.insert(30);

        number2.findCommonItems(number1.getItems(), number2.getItems());
    }
}
