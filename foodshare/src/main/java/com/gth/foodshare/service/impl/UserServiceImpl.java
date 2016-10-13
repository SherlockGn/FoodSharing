package com.gth.foodshare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gth.foodshare.dao.UserMapper;
import com.gth.foodshare.model.User;
import com.gth.foodshare.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean checkUser(String username, String passwd) {
		if (passwd == null)
			return false;
		User user = userMapper.selectByPrimaryKey(username);
		if (user == null)
			return false;
		return passwd.equals(user.getPasswd());
	}

}
