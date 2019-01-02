package dao;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class ConnectionManager {

     public DataSource getDataSource(){

         Properties properties=new Properties();
        InputStream is = getClass().getClassLoader().getResourceAsStream("db.properties");

        MysqlDataSource mysqlDataSource=null;

         try {
             properties.load(is);

             mysqlDataSource=new MysqlDataSource();
             mysqlDataSource.setURL(properties.getProperty("url"));
             mysqlDataSource.setUser(properties.getProperty("username"));
             mysqlDataSource.setPassword(properties.getProperty("password"));



         } catch (IOException e) {
             e.printStackTrace();
         }

         return mysqlDataSource;


     }
}
