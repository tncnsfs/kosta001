package com.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.BoardMapper;
import com.service.Board;
import com.service.Search;

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
	

	
	// insertChecklist
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
	
	// readList + count <== 페이지 영역 
	//	--------------------------------------------------------------
	// 총글갯수 구하기
	public int countBoard(Search search) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = 0;
		try {
			re = sqlSession.getMapper(BoardMapper.class).countBoard(search);
			System.out.println("re는:"+ re);
			if(re >0){
				sqlSession.commit();
			}else{
				sqlSession.rollback();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sqlSession.close();
		}
		return re;
	}
	//	--------------------------------------------------------------
	public List<Board> listboard(Search search, int startRow) {
		
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Board> list = null;
		
		try {
			list = sqlSession.getMapper(BoardMapper.class).listBoard(new RowBounds(startRow, 2), search);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return list;
	}
	



	
	
}
