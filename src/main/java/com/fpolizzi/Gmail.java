package com.fpolizzi;

/**
 * Created by fpolizzi on 28.02.26
 */
public class Gmail implements EmailSender {

    @Override
    public void send() {
        System.out.println("sending email using gmail...");
    }
}
