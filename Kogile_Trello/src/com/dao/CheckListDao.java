package com.dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.BoardMapper;
import com.service.Board;

public class CheckListDao {
	private static CheckListDao dao = new CheckListDao();
	public static CheckListDao getInstance() {
		return dao;
		
	}
	
	
	public SqlSessionFactory getSqlSessionFactory() {
		
		String resource = "mybatis-config.xml";
		InputStream in = null;
		
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return new SqlSessionFactoryBuilder().build(in);
	}
	
//	--------------------------------------------------------------
	
	public int insertchecklist(Board board) {
		
		SqlSession sqlSession = dao.getSqlSessionFactory().openSession();
		
		int re = -1;
		
		try {
			re = sqlSession.getMapper(BoardMapper.class).insertchecklist(board);
			if(re >0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		
		return re;
		
	}
	
}
