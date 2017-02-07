package com.oauth2.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@RequestMapping(value = "/test/user", method = RequestMethod.GET)
    public Object listAllUsers() {
        return "This user";
    }
	
	@RequestMapping(value = "/service/user", method = RequestMethod.GET)
    public Object service() {
        return "This service";
    }
}
