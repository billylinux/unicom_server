package com.cn.listview;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.cn.listviewdb.ListViewQuery;

/**
 * 
 * idΪ����һ��Ŀ�ı�ţ���������д�id���򷵻�id�Ժ����Ϣ��Ŀ
 * idΪ���򷵻������20������
 * 
 * @author Jerry
 *
 */

public class ListViewServlet extends HttpServlet {

	
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		this.doPost(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		resp.setContentType("application/json");
		int id;
		try {
			id=Integer.parseInt(req.getParameter("id"));
		} catch (Exception e) {
			// TODO: handle exception
			id=0;
		}finally{
			
		}
		
//		json.put("test", 1);
		ListViewJson lvj= new ListViewJson();
//		try {
//			json=lvj.getListViewsJson(new ListViewQuery().getItemsById(id));			
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}		
//		req.setAttribute("json", json);
		
		try {
			req.setAttribute("json", lvj.getListViewString(new ListViewQuery().getItemsById(id)));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		req.getRequestDispatcher("JSP_getJson.jsp").forward(req, resp);
		
		
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
