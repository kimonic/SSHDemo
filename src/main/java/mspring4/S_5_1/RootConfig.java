package mspring4.S_5_1;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import mjava.dao.LoginDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.beans.PropertyVetoException;
import java.util.Properties;

/**
 * 纯Java配置 spring-Config.xml文件可以完全废弃
 */
@SuppressWarnings("Duplicates")
@Configuration
@ComponentScan(basePackages = {"mspring4.S_5_1"},
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION,
                        value = EnableWebMvc.class
                )
        })
public class RootConfig {
    @Bean
    ComboPooledDataSource comboPooledDataSource() throws PropertyVetoException {
        ComboPooledDataSource comboPooledDataSource=
                new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("dingzhixin");
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/xh_database?serverTimezone=GMT");
        return comboPooledDataSource;
    }

    @Bean(name = "sessionFactory")
    LocalSessionFactoryBean sessionFactoryBean() throws PropertyVetoException {
        LocalSessionFactoryBean sessionFactoryBean=new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(comboPooledDataSource());
        Properties properties=new Properties();
        properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
        properties.setProperty("hibernate.show_sql","true");
        properties.setProperty("hibernate.format_sql","true");
        properties.setProperty("hibernate.hbm2ddl.auto","update");
        sessionFactoryBean.setHibernateProperties(properties);
        sessionFactoryBean.setMappingResources("mjava/dao/LoginBean.hbm.xml");
        return sessionFactoryBean;
    }

    @Bean
    HibernateTransactionManager transactionManager() throws PropertyVetoException {
        HibernateTransactionManager transactionManager=new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactoryBean().getObject());
        return transactionManager;
    }


    @Bean
    LoginDAO loginDAO() throws PropertyVetoException {
        LoginDAO loginDAO=new LoginDAO();
        loginDAO.setSessionFactory(sessionFactoryBean().getObject());
        return loginDAO;
    }


}
