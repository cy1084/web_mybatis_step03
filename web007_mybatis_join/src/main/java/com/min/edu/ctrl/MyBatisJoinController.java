package com.min.edu.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//extends HttpServlet
//화면에 요청을 받을 수 있는 클래스가 됨
public class MyBatisJoinController extends HttpServlet{

	private static final long serialVersionUID = -5363030570604979040L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; UTF-8;");
		
		
		// -- DAO, Service 실행해서 HttpServletRequest에 담은 후 jsp에 전달
		
		req.setAttribute("serverValue", "server전송값"); //pass by reference로 req에 담아줌
		req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp); 
		//여기 설명 0531 3시 45분~
		
		
	}
	
}
