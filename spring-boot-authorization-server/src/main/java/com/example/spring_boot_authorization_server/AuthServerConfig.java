
package com.example.spring_boot_authorization_server;

import java.util.UUID;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import java.time.Duration;
@Configuration
@EnableAuthorizationServer
public class AuthServerConfig extends AuthorizationServerConfigurerAdapter {

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
            .withClient("my-client")
            .secret("{noop}my-secret") // no-op encoder
            .authorizedGrantTypes("client_credentials", "password", "refresh_token")
            .scopes("read", "write")
            .accessTokenValiditySeconds(3600);
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) {
        // default config sufficient for simple use case
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) {
        security
            .tokenKeyAccess("permitAll()")
            .checkTokenAccess("isAuthenticated()");
    }
}
