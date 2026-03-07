package com.fpolizzi.functional;

import java.util.function.Function;

/**
 * Created by fpolizzi on 07.03.26
 */
public class ChainingFunctions {

    static void main() {

        Function<Integer, Integer> combinedFunction =
                incrementByOne.andThen(doubleByTwo);

        System.out.println(combinedFunction.apply(2));
        System.out.println(combinedFunction.apply(5));
    }

    static Function<Integer, Integer> incrementByOne =
            number -> number + 1;

    static Function<Integer, Integer> doubleByTwo =
            number -> number * 2;

}
