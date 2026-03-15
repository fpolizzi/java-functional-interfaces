package com.fpolizzi.functional;

import java.util.List;
import java.util.function.Consumer;

/**
 * Created by fpolizzi on 07.03.26
 */
public class ConsumerMain {

    static void main() {

        // sendEmail("hello@amigoscode.com");
        sendEmailConsumer.accept("hello@amigoscode.com");

        List<String> emails = List.of(
                "test@amigoscode.com",
                "robert@amigoscode.com",
                "mary@amigoscode.com",
                "alex@amigoscode.com",
                "yusuf@amigoscode.com"
        );

        // invoke by lambda
        emails.forEach(email -> sendEmail(email));

        System.out.println();

        // invoke by method reference
        emails.forEach(ConsumerMain::sendEmail);
    }

    static Consumer<String> sendEmailConsumer =
            email -> System.out.println("sending email to " + email);

    static void sendEmail(String email) {

        System.out.println("sending email to " + email);
    }
}
