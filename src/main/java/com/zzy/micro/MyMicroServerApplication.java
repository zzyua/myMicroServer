package com.zzy.micro;

import com.zzy.micro.demos.startuoRunner.StartupRunner;
import com.zzy.micro.demos.startuoRunner.TaskRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class MyMicroServerApplication
{

	private final  static Logger logger = LoggerFactory.getLogger(MyMicroServerApplication.class);



	public static void main(String[] args) {
		SpringApplication.run(MyMicroServerApplication.class, args);
	}


	/**
	 * 注册bean
	 * @return StartupRunner的Bean
	 */
	@Bean
	public StartupRunner startupRunner(){
		return  new StartupRunner();
	}

	/**
	 * 注册bean
	 * @return TaskRunner的Bean
	 */
	@Bean
	public TaskRunner taskRunner(){
		return  new TaskRunner();
	}




}
