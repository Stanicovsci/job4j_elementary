package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = 1/2 * (a + b + c);
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(3, 3, 3);
        System.out.println("area (3, 3, 3) = " + rsl);
    }
}
