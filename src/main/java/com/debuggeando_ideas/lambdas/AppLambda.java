package com.debuggeando_ideas.lambdas;

import java.util.List;

public class AppLambda {

    public static void main(String[] args) {

        List<String> countries = List.of("Mexico", "Colombia", "Argentina", "Chile", "Uruguay");

        for (String c: countries){
            System.out.println(c);
        }

        // Con lambda
        countries.forEach(c -> System.out.println(c.toUpperCase()));
    }
}
