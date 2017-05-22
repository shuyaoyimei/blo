package com.shuyaoyimei.blog.data;

import junit.framework.TestCase;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionFactoryBean;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by mafu on 5/21/17.
 */
public class MybatisConfigTest extends TestCase {

    public void  testMybatisConfig(){
        Statement stmt = null;
        Connection conn = null;
        try {
            conn = getDataSource().getConnection();
            stmt = conn.createStatement();
            stmt.execute("CREATE TABLE  test1 (name VARCHAR(20),sex CHAR(1)) " );

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
            if (stmt !=null){
                    stmt.close();
                }if (conn!= null){
                    conn.close();
                }
            }catch (SQLException e) {
                    e.printStackTrace();
            }
        }

    }

    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_blog");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }

    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(getDataSource());
        return sessionFactory.getObject();
    }
}
