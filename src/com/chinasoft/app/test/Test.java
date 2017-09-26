package com.chinasoft.app.test;

import java.util.List;

import com.chinasoft.app.dao.UserDao;
import com.chinasoft.app.dao.impl.UserDaoImpl;
import com.chinasoft.app.domain.User;

public class Test {

	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		//增加
//		User user = new User("张胜男","123");
//		
//		userDao.save(user);
		//删除，必须有id
		//userDao.delete(5);
//		User user = new User();
//		user.setUid(1);
//		userDao.delete(user);
		//修改
//		User user = userDao.get(2);
//		user.setUsername("春妹");
//		userDao.update(user);
		//查询,条件查询
		List<User> list = userDao.findAll("username=?", "春妹");
		System.out.println(list.get(0).getUsername());
	}

}
