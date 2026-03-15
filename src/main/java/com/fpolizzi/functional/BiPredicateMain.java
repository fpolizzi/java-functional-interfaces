package com.fpolizzi.functional;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Created by fpolizzi on 15.03.26
 */
public class BiPredicateMain {

    static void main(String[] args) {

        var email = "hello@amigoscode.com";

        boolean test = isValidEmailBiPredicate.test(email, email);

        System.out.println(test);
    }

    static Predicate<String> isValidEmailPredicate =
            email -> email.contains("@");

    static Predicate<String> containsDotPredicate =
            email -> email.contains(".");

    // example for a BiPredicate
    static BiPredicate<String, String> isValidEmailBiPredicate =
            (email1, email2) -> isValidEmailPredicate.test(email1)
                    &&containsDotPredicate.test(email2);
}
