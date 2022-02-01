package com.company;

public class Main {

    public static void main(String[] args) {
       final int num = 2021;
        String word1 = "Geek ";
        String word2 = "Tech ";
        String word3 = "Osh ";
        System.out.println(word1 + word2 + word3 + num);

        if (num < 0){
            System.out.println("значение отрицательное число");
        } else if (num == 0){
            System.out.println("значение ноль");
        } else {
            System.out.println("значение положительное число");
        }
    }
}
