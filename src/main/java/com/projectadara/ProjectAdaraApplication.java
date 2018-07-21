package com.projectadara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = { "com.projectadara.Controller" })
//@EnableJpaRepositories(basePackages = { "com.projectadara.Repository" })
public class ProjectAdaraApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjectAdaraApplication.class, args);
	}
}
