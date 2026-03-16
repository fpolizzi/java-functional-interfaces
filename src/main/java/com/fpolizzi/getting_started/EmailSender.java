package com.fpolizzi.getting_started;

/**
 * Created by fpolizzi on 28.02.26
 */
@FunctionalInterface
public interface EmailSender {

    // change the abstract method that
    // you now have to pass an email String
    void send(String from, String to);
}
