package com.fpolizzi.functional;

import java.util.List;

/**
 * Created by fpolizzi on 16.03.26
 */
public class EmailValidatorMain {

    static void main() {

        EmailValidator emailValidator = new EmailValidator();

        List<String> emails = List.of(
                "hello@amigoscode.com",
                "hello-amigoscode.com"
        );

        emails.forEach(email -> {
            var isValid = emailValidator.apply(email);
            System.out.println("Email %s is valid: %s".formatted(email, isValid));
        });
    }
}
