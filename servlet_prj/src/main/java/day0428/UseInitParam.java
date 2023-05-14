package day0428;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class UseInitParam extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//DD(web.xml)에서 정의된 값 입력
		
		//1. ServletConfig 객체 얻기
		ServletConfig sc = getServletConfig();
		//2. ServletConfig 객체로부터 값을 얻기
		String name = sc.getInitParameter("name");
		String age = sc.getInitParameter("age");
		String addr = sc.getInitParameter("addr");
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);

	}//doGet

}//class
