package com.fpolizzi.extending_functional_interfaces;

import com.fpolizzi.extending_functional_interfaces.PersonRegistrationValidator.ValidationResult;
import static com.fpolizzi.extending_functional_interfaces.PersonRegistrationValidator.ValidationResult.*;

import java.util.function.Function;

/**
 * Created by fpolizzi on 16.03.26
 */
public interface PersonRegistrationValidator
        extends Function<Person, ValidationResult> {

    static PersonRegistrationValidator isEmailValid() {

        return person -> person.email().contains("@") ?
                SUCCESS : EMAIL_NOT_VALID_ERROR;
    }

    static PersonRegistrationValidator isPhoneNumberValid() {

        return person -> person.phoneNumber().contains("+") ?
                SUCCESS : PHONE_NOT_VALID_ERROR;
    }

    static PersonRegistrationValidator isEmailTaken() {

        return person -> SUCCESS;
    }

    default PersonRegistrationValidator and(
            PersonRegistrationValidator other) {

        return person -> {

            ValidationResult result = this.apply(person);

            // chain various validations
            return result.equals(SUCCESS) ?
                    other.apply(person) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        EMAIL_NOT_VALID_ERROR,
        EMAIL_TAKEN_ERROR,
        PHONE_NOT_VALID_ERROR,
        NOT_ADULT_ERROR
    }
}
