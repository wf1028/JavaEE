package com.qf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.qf")
@PropertySource("classpath:jdbcConfig.properties")
@Import(jdbcConfig.class)
public class SpringConfigger {
}
