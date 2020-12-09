package com.task2;

public class Main {
    public static void main(String[] args) {
        int salary = 70000;
        double ndfl = 0.13;
        double exit;
        exit = salary - (ndfl * salary);
        System.out.println("Зарплата без НДФЛ составляет: " + exit + " рублей");
    }
}