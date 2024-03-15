package com.NateAra.DataStructure.Queues;


public class QueMain {
    public static void main(String[] args) {

        PriorityQueueArr pri = new PriorityQueueArr();
        pri.add(3);
        pri.add(2);
        pri.add(5);
        pri.add(1);
        pri.add(4);
        System.out.println(pri.remove());
        System.out.println(pri);
    }
}
