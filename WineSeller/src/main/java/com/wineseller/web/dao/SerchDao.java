package com.wineseller.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.wineseller.web.entity.WineEntity;

@Mapper
public interface SerchDao {
	
	
	@Select("SELECT * FROM WINE")
	List<WineEntity> getList();
	
	@Select("SELECT * FROM WINE WHERE id = #{id}")
	WineEntity getView(int id);
}
