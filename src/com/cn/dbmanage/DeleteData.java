/**
 * 
 */
package com.cn.dbmanage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cn.jdbc.JDBC_Connection;

/**
 * 
 * ��ɶ����ݿ����ݵ�ɾ������
 * 
 * @author Jerry
 *
 */
public class DeleteData {
	
	//ɾ���ض��ĳ���
	public static void deleteCity(String city) throws SQLException{
		Connection conn=null;
		PreparedStatement pstm=null;
		
		conn=JDBC_Connection.getConnection();
		String sql="DELETE FROM position_city WHERE cityname=?";
		pstm=conn.prepareStatement(sql);
		pstm.setString(1, city);
		pstm.executeUpdate();		
	}
	
	public static void deleteCity(int id) throws SQLException{
		Connection conn=null;
		PreparedStatement pstm=null;
		
		conn=JDBC_Connection.getConnection();
		String sql="DELETE FROM position_city WHERE id=?";
		pstm=conn.prepareStatement(sql);
		pstm.setInt(1, id);
		
		pstm.executeUpdate();
	}
	
	//ɾ���ض����е�������������
	public static void deleteShop(String city) throws SQLException{
		Connection conn=null;
		PreparedStatement pstm=null;
		
		conn=JDBC_Connection.getConnection();
		String sql="DELETE FROM position_shop WHERE cityname=?";
		pstm=conn.prepareStatement(sql);
		pstm.setString(1, city);
		pstm.executeUpdate();
	}
	
	//ɾ���ض���������Ŀ	
	public static void deleteShop(int id) throws SQLException{
		Connection conn=null;
		PreparedStatement pstm=null;
		
		conn=JDBC_Connection.getConnection();
		String sql="DELETE FROM position_city WHERE id=?";
		pstm=conn.prepareStatement(sql);
		pstm.setInt(1, id);
	}
	
	
		
		
}
