package com.zh.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zh.dubbo.demo.api.DemoService;




public class AppTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "dubbo-consumer.xml" });
		context.start();

		System.out.println("Dubbo consumer start...");

		 DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
	        String hello = demoService.sayHello("张浩"); // 执行远程方法
	        System.out.println(hello); // 显示调用结果
	}

}
