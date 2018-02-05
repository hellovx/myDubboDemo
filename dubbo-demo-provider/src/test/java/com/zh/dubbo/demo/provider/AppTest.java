package com.zh.dubbo.demo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
	                new String[] { "dubbo-provider.xml" });
	        context.start();

	        System.out.println("Dubbo provider start...");

	        try {
	            System.in.read();   // 按任意键退出
	        } catch (IOException e) {
	            e.printStackTrace();
	        } 
	}

}
