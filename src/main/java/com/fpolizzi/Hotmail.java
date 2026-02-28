package com.fpolizzi;

/**
 * Created by fpolizzi on 28.02.26
 */
public class Hotmail implements EmailSender {

    @Override
    public void send() {
        System.out.println("sending email using hotmail...");
    }
}
