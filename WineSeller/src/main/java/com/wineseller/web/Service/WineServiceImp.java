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
	public List<WineEntity> getList(int page) {
		
		int size = 4;
		int offset = 0+(page-1)*size;
		
		List<WineEntity> list = serchDao.getList(offset, size);
		return list;
	}

	@Override
	public WineEntity getView(int id) {
		
		WineEntity getView = serchDao.getView(id);
		return getView;
	}

}