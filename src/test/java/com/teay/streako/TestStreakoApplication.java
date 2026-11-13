package com.teay.streako;

import org.springframework.boot.SpringApplication;

public class TestStreakoApplication {

	public static void main(String[] args) {
		SpringApplication.from(StreakoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
