package com.gth.foodshare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gth.foodshare.dao.MallMapper;
import com.gth.foodshare.model.Mall;
import com.gth.foodshare.service.MallService;

@Service
public class MallServiceImpl implements MallService {

	@Autowired
	private MallMapper mallMapper;

	public List<Mall> findAll() {
		return mallMapper.findAll();
	}

}
