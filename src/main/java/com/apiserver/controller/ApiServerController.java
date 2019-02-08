/**
 * 
 */
package com.apiserver.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apiserver.dto.User;
import com.apiserver.service.EndPointUrlService;
 
@RestController
@SpringBootApplication
@ComponentScan("com")
@RequestMapping("/api/server")
public class ApiServerController {
	@Autowired
	private EndPointUrlService endPointUrlService;
	 
	 @RequestMapping(value="/user",method=RequestMethod.GET)
	 public Object getUser() {
		   HashMap<String, String> map=new HashMap<>();
		   map.put("name", "abc");
		   map.put("address", "meerut");
		   map.put("mobile", "2334444");
		 return map;//endPointUrlService.getUserProfileEndPoint();
	 }
	 
	 @RequestMapping(value="/user/{id}",method=RequestMethod.GET)
		public Object getUser(@PathVariable int id){
			User user=new User("N","A",456);
		 	return user;
		}
	 
	public static void main(String[] args) {
		SpringApplication.run(ApiServerController.class, args);
	}

}
