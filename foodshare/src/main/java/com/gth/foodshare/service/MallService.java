package com.gth.foodshare.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gth.foodshare.model.Mall;

@Service
public interface MallService {
	
	public List<Mall> findAll();
}
