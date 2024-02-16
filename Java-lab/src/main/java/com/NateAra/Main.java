package com.NateAra;

public class Main {
    public static void main(String[] args) {



        System.out.println();

    }

    public static String rps(String p1, String p2) {
        return p1.equals(p2) ? "Draw!" : "Player " + ((("rockscissors scissorspaper paperrock").contains(p1 + p2)) ? 1 : 2) + " won!";
    }

}