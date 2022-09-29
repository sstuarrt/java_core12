package com.company.java_core.homework12.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Car implements Comparable<com.company.java_core.homework11.task2.Car>{
    final Random random = new Random();
    private int horse;
    private int year;
    private ArrayList<Car> data;

    public Car(int horse, int year, ArrayList<Car> data) {
        this.horse = horse;
        this.year = year;
        this.data = data;

        Arrays.fill(new ArrayList[]{data}, 10);
    }

    public int getHorse() {
        return horse;
    }

    public void setHorse(int horse) {
        this.horse = horse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(com.company.java_core.homework11.task2.Car o) {
        return Integer.compare(this.horse, this.year);
    }
}

