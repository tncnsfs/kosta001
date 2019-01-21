package com.dao;

import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.mapper.ListBoardMapper;
import com.service.ListBoard;

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
			// TODO: handle exception
		}
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	// insertlist
	//	--------------------------------------------------------------
	public int insertlist(ListBoard listboard) {
		SqlSession sqlSession = dao.getSqlSessionFactory().openSession();
		int re = -1;
		try {
			re = sqlSession.getMapper(ListBoardMapper.class).insertlist(listboard);
			if(re >0) {
				System.out.println("DAOinsertRE 는:" + re);
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
	
	public List<ListBoard> listBoard20(int checklist_no) {
		
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<ListBoard> list = null;
		
		try {
			list = sqlSession.getMapper(ListBoardMapper.class).listBoard20(checklist_no);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return list;
	}

	
	public ListBoard detailBoard20(int checklist_no) {
		SqlSession sqlSession = getSqlSessionFactory().openSession(); //sqlSession객체를 가져올수 있다.
		ListBoard listboard = null;
		
		try {
			listboard = sqlSession.getMapper(ListBoardMapper.class).detailBoard20(checklist_no);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return listboard;
	}


	
	public int deleteBoard20(ListBoard listboard) {
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(ListBoardMapper.class).deleteBoard20(listboard);
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

	public int updateBoard20(ListBoard listboard){
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(ListBoardMapper.class).updateBoard20(listboard);
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
