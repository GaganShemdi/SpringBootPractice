package com.springcourse.gagan.module1Introduction.Impl;

import com.springcourse.gagan.module1Introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emailNotif")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email Sending... " + message );
    }
}
