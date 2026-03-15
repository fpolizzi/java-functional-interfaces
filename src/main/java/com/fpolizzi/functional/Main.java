package com.fpolizzi.functional;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by fpolizzi on 06.03.26
 */
public class Main {

    static void main() {

        // invoke a classical method
        System.out.println(incrementByOne(1));

        // invoke a simple function
        System.out.println(incrementByOneFunctional.apply(2));

        // invoke the classical method and combining it with streams
        List<Integer> integers = List.of(1, 2, 3, 4, 5)
                .stream()
                .map(Main::incrementByOne)
                .collect(Collectors.toList());

        System.out.println(integers);
    }

    // functional programming
    static Function<Integer, Integer> incrementByOneFunctional =
            number -> number + 1;

    // pre-functional programming (OOP)
    static int incrementByOne(int number) {

        return number + 1;
    }
}
