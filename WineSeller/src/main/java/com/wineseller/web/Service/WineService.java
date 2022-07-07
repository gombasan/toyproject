package com.wineseller.web.Service;

import java.util.List;

import com.wineseller.web.entity.WineEntity;

public interface WineService {
	
	
	List<WineEntity> getList(int page);
	WineEntity getView(int id);
}
