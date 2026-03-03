package com.fpolizzi;

import java.util.List;
import java.util.function.Consumer;

/**
 * Created by fpolizzi on 03.03.26
 */
public class Names {

    static void main() {
        // define a List of names
        List<String> names = List.of("Jamila", "Alex", "Mariam");

        // iterate over names and print them out
        for (String name : names) {
            System.out.println(name);
        }

        // print out the names by using a lambda
        // and the FunctionalInterface Consumer
        Consumer<String> stringConsumer =
                name -> System.out.println(name);

        names.forEach(stringConsumer);
    }
}
