package com.shuyaoyimei.blog.config;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by mafu on 5/21/17.
 */
@Configuration
public class DataConfig {
    private DataSource dataSource = null;

    @Bean
    public DataSource dataSource(){
        if (dataSource != null){
            return dataSource;
        }
        Properties props = new Properties();
        props.setProperty("driverClassName","com.mysql.jdbc.Driver");
        props.setProperty("url", "jdbc:mysql://localhost:3306/spring_blog");
        props.setProperty("username","root");
        props.setProperty("password","123456");
        try {
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }

}
