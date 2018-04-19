package com.altia.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages= {"com.altia"},
			   excludeFilters= {@Filter(type=FilterType.ANNOTATION)})
public class RootConfig {

}
