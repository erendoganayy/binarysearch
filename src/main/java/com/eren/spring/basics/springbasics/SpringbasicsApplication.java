package com.eren.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbasicsApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch=new BinarySearchImpl(new BubbleSortAlgorithm());

		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(SpringbasicsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result=binarySearch.binarySearch(new int[]{124,6,4},3);
		System.out.println(result);

	}

}
