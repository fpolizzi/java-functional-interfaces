package com.fpolizzi.exercise;

import java.util.function.BiConsumer;

/**
 * Created by fpolizzi on 14.03.26
 */
public class EmailFromToExercise {

    static BiConsumer<String, String> sendEmailBiConsumer =
            (from, to) ->
                    System.out.printf("sending email from %s to %s", from, to);

    static void main(String[] args) {

        sendEmailBiConsumer.accept("robert@amigoscode.com", "mary@amigoscode.com");
    }
}
