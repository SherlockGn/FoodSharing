package com.gth.foodshare.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
	boolean checkUser(String username, String passwd);
}
