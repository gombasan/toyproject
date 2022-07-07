package com.wineseller.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.wineseller.web.entity.WineEntity;

@Mapper
public interface SerchDao {
	
	
	List<WineEntity> getList(int offset, int size);
	
	@Select("SELECT * FROM WINE WHERE id = #{id}")
	WineEntity getView(int id);
}
