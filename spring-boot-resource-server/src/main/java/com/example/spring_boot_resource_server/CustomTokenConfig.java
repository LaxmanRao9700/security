package com.example.spring_boot_resource_server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

@Configuration
public class CustomTokenConfig {
	  @Bean
	    public ResourceServerTokenServices tokenServices() {
	        RemoteTokenServices tokenServices = new RemoteTokenServices();
	        tokenServices.setCheckTokenEndpointUrl("http://localhost:9000/oauth/check_token");
	        tokenServices.setClientId("my-client");
	        tokenServices.setClientSecret("my-secret");
	        return tokenServices;
	    }
}
