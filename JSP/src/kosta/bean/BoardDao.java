package kosta.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class BoardDao {
	private static BoardDao dao = new BoardDao();
	
	// 싱글톤 방식 
	public static BoardDao getInstance(){
		return dao;
	}
	
	//DBCP방식으로 Connection객체 구하기  
	public Connection getConnection(){
		DataSource ds = null;
		try {
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
			
			return ds.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Board detailBoard(int seq){
		// while대신 if
		// rs.next
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from board where seq = ?";
		Board board = new Board();
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				board.setSeq(rs.getInt("seq"));
				board.setWriter(rs.getString("writer"));
				board.setTitle(rs.getString("title"));
				board.setContents(rs.getString("contents"));
				board.setRegdate(rs.getString("regdate"));
				board.setHitcount(rs.getInt("hitcount"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return board;
		
	}
	
	
	public List<Board> listBoard(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Board> list = null;
		
		String sql = "select * from board order by seq desc";
		
		try {
			conn = getConnection();
//			System.out.println("conn:" + conn);	
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			list = new ArrayList<>();
			
			while(rs.next()){
				Board board = new Board();
				board.setSeq(rs.getInt("seq"));
				board.setWriter(rs.getString("writer"));
				board.setTitle(rs.getString("title"));
				board.setContents(rs.getString("contents"));
				board.setRegdate(rs.getString("regdate"));
				board.setHitcount(rs.getInt("hitcount"));
				
				list.add(board);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int insertBoard(Board board){
//		System.out.println(board);
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "kosta192";
		String password = "1234";
		String sql = "insert into board values(board_seq.nextval,"
				+ "?,?,?,sysdate,0)";
		
		int re = -1;
		
		try {
			// 1단계 JDBC 드라이버 로딩 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계 Connection객체 생성(DB연결) 
			conn = DriverManager.getConnection(url, user, password);
			
			// 3단계 PrepareStatement 객체생성,, SQL 질의문 일꾼 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getContents());
			
			re = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return re;
		
	}
}
