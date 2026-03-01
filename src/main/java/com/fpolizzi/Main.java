package com.fpolizzi;

/**
 * Created by fpolizzi on 28.02.26
 */
public class Main {

    static void main() {

        // example for the classic OOP approach
        // using an Email class that implements the interface EmailSender
        EmailSender emailSenderOne = new Gmail();
        emailSenderOne.send();

        // use another Email class that implements the same interface
        EmailSender emailSenderTwo = new Hotmail();
        emailSenderTwo.send();

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
        // the curly braces can be omitted
        EmailSender amigosCodeSender = () -> {
                System.out.println(
                        "sending email using Amigoscode server...");
        };

        amigosCodeSender.send();
    }
}
