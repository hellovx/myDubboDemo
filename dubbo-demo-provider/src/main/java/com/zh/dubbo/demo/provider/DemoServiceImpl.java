package com.zh.dubbo.demo.provider;

import com.zh.dubbo.demo.api.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		System.out.println("接口被请求,参数为:"+name);
		return "Hello " + name;
	}

}
