package com.example.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableJpaRepositories(basePackages = {"com.example.repository"})
@EntityScan(basePackages={"com.example.domain"})
//@PropertySource("application.properties")
@EnableTransactionManagement
public class DataSourceConfig {
	
	
//	  @Primary
//	  @Bean(name = "dataSource")
//	  @ConfigurationProperties(prefix = "spring.datasource")
//	  public DataSource dataSource() {
//	    return DataSourceBuilder.create().build();
//	  }
//	  
//	  @Primary
//	  @Bean(name = "entityManagerFactory")
//	  public LocalContainerEntityManagerFactoryBean 
//	  entityManagerFactory(
//	    EntityManagerFactoryBuilder builder,
//	    @Qualifier("dataSource") DataSource dataSource
//	  ) {
//	    return builder
//	      .dataSource(dataSource)
//	      .packages("com.example.domain")
//	      .build();
//	  }
//	    
//	  @Primary
//	  @Bean(name = "transactionManager")
//	  public PlatformTransactionManager transactionManager(
//	    @Qualifier("entityManagerFactory") EntityManagerFactory 
//	    entityManagerFactory
//	  ) {
//	    return new JpaTransactionManager(entityManagerFactory);
//	  }
	}

