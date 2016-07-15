package com.we.sew.site.core.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author vladyslav
 */
@Configuration
public class ApplicationConfig {

	@Autowired
	private DataSource dataSource;

	@Bean
	public Flyway flyway() {
		Flyway flyway = new Flyway();
		flyway.setDataSource(dataSource);
		return flyway;
	}

}
