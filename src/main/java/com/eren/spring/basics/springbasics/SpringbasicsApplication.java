package com.eren.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbasicsApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch=new BinarySearchImpl();
		int result=binarySearch.binarySearch(new int[]{124,6,4},3);
		System.out.println(result);

		SpringApplication.run(SpringbasicsApplication.class, args);

	}

}
