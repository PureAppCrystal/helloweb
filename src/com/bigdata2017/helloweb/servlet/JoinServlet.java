package com.bigdata2017.helloweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/join")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post 방식으로 데이터를 전달 받는 경우
		//encoding charset을 지정
		request.setCharacterEncoding( "utf-8" );
		System.out.println("-----------------");
		
		String type = request.getParameter( "type" );
		System.out.println( type );
		
		String email = request.getParameter( "email" );
		System.out.println( email );
		
		String password = request.getParameter( "password" );
		System.out.println( password );
		
		String name = request.getParameter( "name" );
		System.out.println( name );
		
		String gender = request.getParameter( "gender" );
		System.out.println( gender );
		
		String birthYear = request.getParameter( "birth-year" );
		System.out.println( birthYear );
		
		String [] hobbies = request.getParameterValues( "hobby" );
		if ( hobbies != null ) {
			for( String hobby : hobbies) {
				System.out.println( hobby );
			}
		}
		
		String selfIntro = request.getParameter( "self-intro" );
		System.out.println( selfIntro );
		
		
		//응답
		response.setContentType( "text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println( "<h1> 성공적으로 가입되었습니다. </h1>");
		out.println( "<a href= '/helloweb/form.jsp'> 폼으로 가기 " );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
