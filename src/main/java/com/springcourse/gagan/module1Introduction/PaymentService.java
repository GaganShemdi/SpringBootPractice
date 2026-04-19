package com.springcourse.gagan.module1Introduction;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void pay(){
        System.out.println("Paying...");
    }

    @PostConstruct
    public void afterinita(){
        System.out.println("Before Paying ...");
    }

    @PreDestroy
    public void beforedestroy(){
        System.out.println("After Paying... ");
    }
}
