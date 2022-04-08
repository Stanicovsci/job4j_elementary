package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        System.out.println(idea + "But I am a newbie.");
        int year = 2022;
        idea = "I like Java!" + year;
        System.out.println(idea);
        long l = 129;
        byte b = (byte) l;
        System.out.println("Результат вычисления: " + b);
    }
} 