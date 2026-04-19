package com.springcourse.gagan.module1Introduction.Impl;

import com.springcourse.gagan.module1Introduction.NotificationService;

public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message){
        System.out.println("SMS Sending ... " + message);
    }
}
