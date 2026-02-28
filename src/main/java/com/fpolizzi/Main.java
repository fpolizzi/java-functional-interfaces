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
    }
}
