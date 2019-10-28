package com.qf.config;


import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.Properties;

public class jdbcConfig {
    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;




@Bean(name = "dataSource")
public DataSource getDataSource(@Qualifier("dataSource2")DataSource dataSource){
    return dataSource;
}
//druid连接池
  @Bean(name = "dataSource1")
    public DataSource dataSource() throws Exception {
        Properties properties = new Properties();
        properties.setProperty("url",url);
        properties.setProperty("username",username);
        properties.setProperty("password",password);
        properties.setProperty("driverClassName",driver);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        return dataSource;
    }

//c3p0连接池
  @Bean(name="dataSource2")
    public DataSource createDataSource(){
      ComboPooledDataSource pooledDataSource = new ComboPooledDataSource();
      try {
          pooledDataSource.setDriverClass(driver);
          pooledDataSource.setJdbcUrl(url);
          pooledDataSource.setPassword(password);
          pooledDataSource.setUser(username);
          return pooledDataSource;
      } catch (PropertyVetoException e) {
          return  null;
      }
  }






   @Bean("jdbcTemplate")
    public JdbcTemplate jdbcTemplate() throws Exception {

        Properties properties = new Properties();
        properties.setProperty("url",url);
        properties.setProperty("username",username);
        properties.setProperty("password",password);
        properties.setProperty("driverClassName",driver);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

}
