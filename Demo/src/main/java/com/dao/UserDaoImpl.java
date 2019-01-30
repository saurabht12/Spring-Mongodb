package com.dao;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.data.User;
public class UserDaoImpl implements UserDao {

	 @Autowired
	  DataSource datasource;
	  @Autowired
	  JdbcTemplate jdbcTemplate;
	  public void register(User user) {
		  
		  
	  }

}
