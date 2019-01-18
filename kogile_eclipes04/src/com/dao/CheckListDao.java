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
	
	// readList + count <== �럹�씠吏� �쁺�뿭 
	//	--------------------------------------------------------------
	// 珥앷�媛��닔 援ы븯湲�
	public int countBoard(Search search) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = 0;
		try {
			re = sqlSession.getMapper(BoardMapper.class).countBoard(search);
			System.out.println("re�뒗:"+ re);
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
	public List<Board> listBoard(Search search, int startRow) {
		
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Board> list = null;
		
		try {
			list = sqlSession.getMapper(BoardMapper.class).listBoard(new RowBounds(startRow, 5), search);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return list;
	}

	public Board detailBoard(int checklist_no) {
		SqlSession sqlSession = getSqlSessionFactory().openSession(); //sqlSession媛앹껜瑜� 媛��졇�삱�닔 �엳�떎.
		Board board = null;
		
		try {
			board = sqlSession.getMapper(BoardMapper.class).detailBoard(checklist_no);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return board;
	}


	public int deleteBoard(Board board) {
		
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(BoardMapper.class).deleteBoard(board);
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
	
	public int updateBoard(Board board){
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(BoardMapper.class).updateBoard(board);
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
