package com.zzy.micro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class MyMicroServerApplication
		implements CommandLineRunner
{

	private final  static Logger logger = LoggerFactory.getLogger(MyMicroServerApplication.class);

//	@Autowired
//	private KafkaTemplate template;


	public static void main(String[] args) {
		SpringApplication.run(MyMicroServerApplication.class, args);
	}

	/**
	 * 这个方法会在应用程序完全启动后首先被调用。
	 * @param args 参数
	 * @throws Exception 异常
	 */
	@Override
	public void run(String[] args) throws Exception {
		System.out.println("CommandLineRunner 开始起作用了....");
	}





}
