package kosta.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta.mapper.BoardMapper;
import kosta.mapper.SubBoardMapper;

public class SubBoardDao {
	private static SubBoardDao dao = new SubBoardDao();
	
	public static SubBoardDao getInstance(){
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
	
	public int subInsertBoard(SubBoard board){	//sql°ú ÁøÇà
		int re = -1;
		SqlSession sqlsession = getSqlSessionFactiory().openSession();
		
		try {
			re = sqlsession.getMapper(SubBoardMapper.class).subInsertBoard(board);
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
	
	public List<SubBoard> subListBoard(int seq){
		SqlSession sqlsession = getSqlSessionFactiory().openSession();
		List<SubBoard> list = null;
		try {
			list = sqlsession.getMapper(SubBoardMapper.class).subListBoard(seq);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlsession.close();
		}
		return list;
	}

	public int deleteSubBoard(SubBoard board) {
		int re = -1;
		SqlSession sqlsession = getSqlSessionFactiory().openSession();
		
		try {
			re = sqlsession.getMapper(SubBoardMapper.class).subDeleteBoard(board);
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
