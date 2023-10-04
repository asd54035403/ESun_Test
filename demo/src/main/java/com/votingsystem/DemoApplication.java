package com.votingsystem;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJpaRepositories( //
	basePackageClasses = TableADao.class, //
	entityManagerFactoryRef = "aEntityManagerFactory", //
	transactionManagerRef = "aTransactionManager"
)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
