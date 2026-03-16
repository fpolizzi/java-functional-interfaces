package com.fpolizzi.getting_started;

/**
 * Created by fpolizzi on 28.02.26
 */
public class Main {

    static void main() {

        // to be more concise, we can implement a functional interface
        // which can only have one abstract method
        // @FunctionalInterface optional annotation
        /*EmailSender amigosCodeSender = new EmailSender() {
            @Override
            public void send() {
                System.out.println("sending email using Amigoscode server...");
            }
        };*/

        // implement the same functional interface using a lambda,
        // the curly braces can be omitted when no code block is following
        EmailSender gmail = (from, to ) -> System.out.println(
                "Sending email from gmail to yahoo..");

        gmail.send("anna@gmail.com", "clarence@yahoo.com");

        EmailSender amigoscode = (from, to) -> {
            // logic
            var isValid = to.contains("@");
            // more logic
                System.out.println(
                        "sending email from hotmail to amigoscode...");
        };

        amigoscode.send("eve@hotmail.com", "curt@amigoscode.com");
    }
}
