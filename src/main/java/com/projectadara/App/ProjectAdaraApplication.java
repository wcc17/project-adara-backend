package com.projectadara.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.projectadara.Controller" })
public class ProjectAdaraApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjectAdaraApplication.class, args);
	}
}
