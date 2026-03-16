package com.fpolizzi.extending_functional_interfaces;

import java.util.function.Function;

/**
 * Created by fpolizzi on 16.03.26
 */
public class EmailValidator implements Function<String, Boolean> {

    @Override
    public Boolean apply(String email) {

        return email.contains("@");
    }
}
