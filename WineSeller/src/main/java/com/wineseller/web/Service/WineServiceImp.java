package com.wineseller.web.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wineseller.web.dao.SerchDao;
import com.wineseller.web.entity.WineEntity;

@Service
public class WineServiceImp implements WineService{
	
	@Autowired
	private SerchDao serchDao;

	@Override
	public List<WineEntity> getList() {
		List<WineEntity> list = serchDao.getList();
		return list;
	}
}
