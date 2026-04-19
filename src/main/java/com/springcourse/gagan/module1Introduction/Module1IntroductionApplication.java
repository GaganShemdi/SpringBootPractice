package com.springcourse.gagan.module1Introduction;

import com.springcourse.gagan.module1Introduction.Impl.EmailNotificationService;
import com.springcourse.gagan.module1Introduction.Impl.SmsNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

	@Autowired
	PaymentService paymentServiceObj;


	final NotificationService notificationServiceObj; //  final keyword make it immutable


	public Module1IntroductionApplication(NotificationService notificationServiceObj) {
		this.notificationServiceObj = notificationServiceObj; //construction DI //preferred
	}

	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);
	}
		@Override
		public void run(String... args) throws Exception{
			notificationServiceObj.send("hello");
		}

	}


