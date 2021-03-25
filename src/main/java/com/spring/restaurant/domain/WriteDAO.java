package com.spring.restaurant.domain;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface WriteDAO {
	// 전체 SELECT

	public List<WriteDTO> selectFromRow(
			@Param("from") int from,
			@Param("pageRows") int pageRows);

	// 전체 글의 개수
	public int countAll();
	
	public abstract int insert(WriteDTO dto);
	

	public abstract List<WriteDTO> readByUid(Integer uid);
	
	
	public abstract List<WriteDTO> selectByUid(Integer uid);
	
	
	public abstract int update(WriteDTO dto);
	
	
	public int deleteByUid(int [] uids);


	
} // end DAO
































