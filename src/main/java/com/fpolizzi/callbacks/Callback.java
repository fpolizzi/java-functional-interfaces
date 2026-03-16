package com.fpolizzi.callbacks;

import java.util.function.Consumer;

/**
 * Created by fpolizzi on 16.03.26
 */
public class Callback {

    static void main() {

        hello("Alex", null, cb);
    }

    static Consumer<String> cb = input ->
            System.out.println(input + " you must have a last name");

    static void hello(String firstName,
                      String lastName,
                      Consumer<String> callback) {

        System.out.println(firstName);

        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

}
