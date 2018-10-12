package com.one.controller;


import com.one.utils.SpringContext;
import com.springcloud.common.feign.HelloFeignClient;
import com.springcloud.common.web.ResponseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/login")
	public void login(){
		System.out.println("login..........");
		HelloFeignClient client = SpringContext.getApplicationContext().getBean(HelloFeignClient.class);
		ResponseResult<String>  result = client.sayHello("tom");
		String str = result.getData();
		System.out.println("收到的消息===="+str);
	}
		
}
