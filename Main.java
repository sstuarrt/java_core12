package com.company.java_core.homework12.task1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int getRandomValue(){
        Random r=new Random();
        return r.nextInt(30-5+1)+5;
    }
    public static void main(String[] args) {
        int a=getRandomValue();
        ArrayList<Car> cars = new ArrayList<>();

        for (int i=0; i< a;i++){

            cars.add(new Car(getRandomValue(),getRandomValue(),cars));

        }
        int menu;
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.Print all elements");
        System.out.println("2.Set the all <Car> elements");
        menu=scanner.nextInt();

        if(menu==1){
            System.out.println(cars);
        } else if (menu==2){
            for (int i=0; i< a;i++){

                cars.set(i,new Car(2,5,cars));
            }
            System.out.println(cars);
        } else throw new IllegalArgumentException("Введіть цифру 1 або 2");
    }
}
