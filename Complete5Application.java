package com.wjw.complete5;

import com.wjw.complete5.mymongo.update.Start;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Complete5Application {

	public static void main(String[] args)  {
		SpringApplication.run(Complete5Application.class, args);
		startTest();
	}

	/**
	 * 开始测试
	 */
	private static void startTest() {
		Start test = new Start();
		test.start();
	}
}
