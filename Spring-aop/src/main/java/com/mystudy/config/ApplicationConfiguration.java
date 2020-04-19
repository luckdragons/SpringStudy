package com.mystudy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mystudy.service.*")
public class ApplicationConfiguration {

}
