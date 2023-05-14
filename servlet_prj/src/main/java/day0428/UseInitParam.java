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
		//DD(web.xml)���� ���ǵ� �� �Է�
		
		//1. ServletConfig ��ü ���
		ServletConfig sc = getServletConfig();
		//2. ServletConfig ��ü�κ��� ���� ���
		String name = sc.getInitParameter("name");
		String age = sc.getInitParameter("age");
		String addr = sc.getInitParameter("addr");
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + addr);

	}//doGet

}//class
