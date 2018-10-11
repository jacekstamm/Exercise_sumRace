package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;


public class KodillacourseApplication {

    public static void main(String[] args) {

        int sumaA = 1000;
        int sumaB = 0;
        int runda = 1;

        Random randomGenerator = new Random();

        while(sumaA > sumaB) {
            sumaA += randomGenerator.nextInt(10);
            sumaB += randomGenerator.nextInt(50);
            System.out.println("RUNDA " + runda++);
            System.out.println("sumaA wynosi: " + sumaA);
            System.out.println("sumaB wynosi: " + sumaB + "\n");
        }
    }
}
