package com.spring.restaurant.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restaurant.domain.WriteDAO;
import com.spring.restaurant.domain.WriteDTO;


@Service
public class AjaxService {
	WriteDAO dao;
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<WriteDTO> list(int from, int pageRows){
		dao = sqlSession.getMapper(WriteDAO.class);
		return dao.selectFromRow(from, pageRows);
	}
	
	public int count() {
		dao = sqlSession.getMapper(WriteDAO.class); // MyBatis 사용
		return dao.countAll();
	}
	
	public List<WriteDTO> readByUid(int uid) {
		dao = sqlSession.getMapper(WriteDAO.class);   
		return dao.readByUid(uid);
	}
	
	public int write(WriteDTO dto) {
		dao = sqlSession.getMapper(WriteDAO.class); // MyBatis 사용
		return dao.insert(dto); 
	}
	
	public int update(WriteDTO dto) {
		dao = sqlSession.getMapper(WriteDAO.class); // MyBatis 사용
		return dao.update(dto);
	}
	
	public int deleteByUid(int [] uids) {
		dao = sqlSession.getMapper(WriteDAO.class); // MyBatis 사용
		return dao.deleteByUid(uids);
	}
	
	public List<WriteDTO> selectByUid(int uid) {
		dao = sqlSession.getMapper(WriteDAO.class); // MyBatis 사용
		return dao.selectByUid(uid);  // 1개짜리 List
	}
	
	
}















