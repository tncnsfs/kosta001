package kosta.model;

import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta.mapper.BoardMapper;

public class BoardDao2 {
	private static BoardDao2 dao = new BoardDao2();
	
	public static BoardDao2 getInstance(){
		return dao;
	}
	
// --------------------------------------------------------------------------------------------	
	public SqlSessionFactory getSqlSessionFactory(){
		String resource = "mybatis-config.xml";
		InputStream in = null;
		
		try {
			in = Resources.getResourceAsStream(resource);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new SqlSessionFactoryBuilder().build(in);
	}
	
// --------------------------------------------------------------------------------------------	
	public int countBoard(Search search){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = 0;
		try {
			re = sqlSession.getMapper(BoardMapper.class).countBoard(search);
			if(re >0){
				sqlSession.commit();
			}else{
				sqlSession.rollback();
			}
			
		} catch (Exception e) {
		}finally {
			sqlSession.close();
		}
		return re;
	}
	
// --------------------------------------------------------------------------------------------	
	public int insertBoard(Board board){
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(BoardMapper.class).insertBoard(board);
			if(re >0){
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
	
// --------------------------------------------------------------------------------------------	
	public List<Board> listBoard(Search search, int startRow){
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
// --------------------------------------------------------------------------------------------	
	
	   public Board detailBoard(int seq){
		      SqlSession sqlSession = getSqlSessionFactory().openSession();
		      Board board = null;
		      
		      try {
		         board = sqlSession.getMapper(BoardMapper.class).detailBoard(seq);
		      } catch (Exception e) {
		         e.printStackTrace();
		      }finally {
		         sqlSession.close();
		      }
		      
		      return board;
		   }
	
	
	
// --------------------------------------------------------------------------------------------	
	public int updateBoard(Board board){
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(BoardMapper.class).updateBoard(board);
			if(re >0){
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
	
// --------------------------------------------------------------------------------------------	
	public int deleteBoard(Board board){
		int re1 = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re1 = sqlSession.getMapper(BoardMapper.class).deleteBoard(board);
			if(re1 > 0){
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return re1;
	}
	
}


