package com.chandra;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	private LoadBalancerClient loadBalancer;
	
	@GetMapping("/GetEndPoint")
	public String greetings()
	{
		ServiceInstance instance = loadBalancer.choose("MyService");
		URI storesUri = URI.create(String.format("http://%s:%s", instance.getHost(),instance.getPort()));
		return storesUri.toString();
	}

}
