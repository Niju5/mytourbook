package com.spring.mytourbook;
import com.spring.mytourbook.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MytourbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(MytourbookApplication.class, args);
		System.out.println("test run success");
	}

}
