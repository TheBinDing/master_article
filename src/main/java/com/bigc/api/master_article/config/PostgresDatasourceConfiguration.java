package com.bigc.api.master_article.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableJpaRepositories(entityManagerFactoryRef = "postgresEntityManagerFactory", transactionManagerRef = "postgresTransactionManager", basePackages = {
        "com.bigc.api.master_article" })
@EnableTransactionManagement
public class PostgresDatasourceConfiguration {

    @Bean
    @ConfigurationProperties("spring.datasource.postgres")
    public DataSourceProperties postgreDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource postgresDataSource() {
        return postgreDataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean(name = "postgresEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean postgresEntityManagerFactory(
            @Qualifier("postgresDataSource") DataSource postgresDataSource, EntityManagerFactoryBuilder builder) {

        return builder.dataSource(postgresDataSource)
                .packages("com.bigc.api.master_article").build();
    }

    @Bean
    public PlatformTransactionManager postgresTransactionManager(
            @Qualifier("postgresEntityManagerFactory") EntityManagerFactory factory) {
        return new JpaTransactionManager(factory);
    }

}
