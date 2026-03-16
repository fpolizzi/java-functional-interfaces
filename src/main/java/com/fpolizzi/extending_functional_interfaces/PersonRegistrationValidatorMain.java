package com.fpolizzi.extending_functional_interfaces;

/**
 * Created by fpolizzi on 16.03.26
 */
public class PersonRegistrationValidatorMain {

    static void main() {

        Person jamila = new Person(
                "Jamila",
                "+0000000",
                "jamila@gmail.com"
        );

        Person alex = new Person(
                "Alex",
                "123456",
                "alex@gmail.com"
        );

        PersonRegistrationValidator validator =
                PersonRegistrationValidator
                        .isEmailTaken()
                        .and(PersonRegistrationValidator.isEmailValid())
                        .and(PersonRegistrationValidator.isPhoneNumberValid());

        System.out.println(validator.apply(jamila));
        System.out.println(validator.apply(alex));
    }
}
