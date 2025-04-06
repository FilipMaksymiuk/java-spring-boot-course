package com.springcoredemo.corespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/* skanuje foldery wskazane przeze mnie
@SpringBootApplication(
		scanBasePackages = {"com.springcoredemo.corespring",
		                     "util"}
)
*/
@SpringBootApplication
public class CorespringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorespringApplication.class, args);
	}

}
