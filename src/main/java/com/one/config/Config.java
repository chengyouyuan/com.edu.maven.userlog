package com.one.config;

import org.springframework.cloud.openfeign.FeignClientsRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(FeignClientsRegistrar.class)
public class Config {
}
