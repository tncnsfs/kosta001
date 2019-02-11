package kosta.model;

import java.io.InputStream;
import java.util.List;

import org.apache.catalina.mapper.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta.mapper.BoardMapper;

public class BoardDao {
	private static BoardDao dao = new BoardDao();
	
	public static BoardDao getInstance(){
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactiory(){
		String resource = "mybatis-config.xml";
		
		InputStream in = null;
		
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	public int insertBoard(Board board){	//sql과 진행
		int re = -1;
		SqlSession sqlsession = getSqlSessionFactiory().openSession();
		
		try {
			re = sqlsession.getMapper(BoardMapper.class).insertBoard(board);
			if(re >0 ){
				sqlsession.commit();
			}else{
				sqlsession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlsession.close();
		}
		return re;
	}
	
	public List<Board> listBoard(){
		SqlSession sqlsession = getSqlSessionFactiory().openSession();
		List<Board> list = null;
		try {
			list = sqlsession.getMapper(BoardMapper.class).listBoard();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlsession.close();
		}
		return list;
	}
	
	public Board detailBoard(int seq){
		SqlSession sqlsession = getSqlSessionFactiory().openSession();
		Board oneboard = null;
		System.out.println(seq);
		try {
			oneboard = sqlsession.getMapper(BoardMapper.class).detailBoard(seq);
			System.out.println(oneboard);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(oneboard);
		}finally {
			sqlsession.close();
		}
		
		return oneboard;
	}
	public int updateBoard(Board board){	//sql과 진행
		int re = -1;
		SqlSession sqlsession = getSqlSessionFactiory().openSession();
		
		try {
			re = sqlsession.getMapper(BoardMapper.class).updateBoard(board);
			if(re >0 ){
				sqlsession.commit();
			}else{
				sqlsession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlsession.close();
		}
		return re;
	}
	public int deleteBoard(Board board){	//sql과 진행
		int re = -1;
		SqlSession sqlsession = getSqlSessionFactiory().openSession();
		
		try {
			re = sqlsession.getMapper(BoardMapper.class).deleteBoard(board);
			if(re >0 ){
				sqlsession.commit();
			}else{
				sqlsession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlsession.close();
		}
		return re;
	}
	public int hitcount(Board board){	//sql과 진행
		int re = -1;
		SqlSession sqlsession = getSqlSessionFactiory().openSession();
		
		try {
			re = sqlsession.getMapper(BoardMapper.class).hitCount(board);
			if(re >0 ){
				sqlsession.commit();
			}else{
				sqlsession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlsession.close();
		}
		return re;
	}
	
	
}
