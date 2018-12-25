
package com.sandip.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration

public class FirstOne {
	
	@RequestMapping("/")
    String hello() {
        return "Hello First Home";
    }
	
	 public static void main(String[] args) throws Exception {
	        SpringApplication.run(FirstOne.class, args);
	    }

}
