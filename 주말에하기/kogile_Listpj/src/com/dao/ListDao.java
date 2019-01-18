package com.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.BoardMapper;
import com.service.Board2;
import com.service.Search;

public class ListDao {
	private static ListDao dao = new ListDao();
	public static ListDao getInstance() {
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory() {
		
		String resource = "mybatis-config.xml";
		InputStream in = null;
		
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	// insertChecklist
	//	--------------------------------------------------------------
	public int insertlist(Board2 board2) {
		
		SqlSession sqlSession = dao.getSqlSessionFactory().openSession();
		
		int re = -1;
		
		try {
			re = sqlSession.getMapper(BoardMapper.class).insertlist(board2);
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
	
	//	--------------------------------------------------------------
	public int countBoard2(Search search) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = 0;
		try {
			re = sqlSession.getMapper(BoardMapper.class).countBoard2(search);
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
	public List<Board2> listBoard2(Search search, int startRow) {
		
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Board2> list2 = null;
		
		try {
			list2 = sqlSession.getMapper(BoardMapper.class).listBoard2(new RowBounds(startRow, 1), search);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return list2;
	}

	public Board2 detailBoard2(int list_no) {
		SqlSession sqlSession = getSqlSessionFactory().openSession(); //sqlSessionê°ì²´ë¥? ê°?? ¸?˜¬?ˆ˜ ?žˆ?‹¤.
		Board2 board2 = null;
		
		try {
			board2 = sqlSession.getMapper(BoardMapper.class).detailBoard2(list_no);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return board2;
	}


	public int deleteBoard2(Board2 board2) {
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(BoardMapper.class).deleteBoard2(board2);
			if(re > 0){
				sqlSession.commit();
			}else{
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return re;
	}
	
	public int updateBoard2(Board2 board2){
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(BoardMapper.class).updateBoard2(board2);
			if(re > 0){
				sqlSession.commit();
			}else{
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
