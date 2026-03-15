package com.fpolizzi.functional;

import java.util.function.Supplier;

/**
 * Created by fpolizzi on 15.03.26
 */
public class SupplierMain {

    static void main() {

        System.out.println(getUrlSupplier.get());
    }

    // functional approach
    // a Supplier returns a result without
    // the need of receiving any input values
    static Supplier<String> getUrlSupplier =
            () -> "https://amigoscode.com";

    // classic approach
    static String getUrl() {

        return "https://amigoscode.com";
    }
}
