package com.fpolizzi.functional;

import java.util.function.BiFunction;

/**
 * Created by fpolizzi on 07.03.26
 */
public class BiFunctionMain {

    static void main() {

        Person jamila = personMapperFunctional.apply("Jamila", 22);

        System.out.println(jamila);

        Person alex = personMapper("Alex", 29);

        System.out.println(alex);
    }

    record Person(String name, int age) {}

    static BiFunction<String, Integer, Person> personMapperFunctional =
            // classic lambda invocation
            // (name, age) -> new Person(name, age);

            // method reference
            Person::new;

    // classic(OOP) approach
    static Person personMapper(String name, int age) {

        return new Person(name, age);
    }
 }
