package com.cron.demo;

import com.cron.demo.component.DateComponent;
import com.cron.demo.component.NotificacionComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CronApplication implements CommandLineRunner {
	@Autowired
	private NotificacionComponent notificacionComponent;

	@Autowired
	private DateComponent dateComponent;

	public static void main(String[] args) {
		SpringApplication.run(CronApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//notificacionComponent.main();
		//dateComponent.calculoFechaTramite();
	}
}


