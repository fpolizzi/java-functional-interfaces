package com.fpolizzi.functional;

import java.util.function.Predicate;

/**
 * Created by fpolizzi on 15.03.26
 */
public class PredicateMain {

    static void main() {

        var email = "hello@amigoscode.com";

        System.out.println(isValidEmail(email));

        System.out.println(isValidEmailPredicate.test(email));
    }

    // classic approach (OOP)
    static boolean isValidEmail(String email) {

        return email.contains("@");
    }

    // functional approach
    static Predicate<String> isValidEmailPredicate =
            email -> email.contains("@");

}
