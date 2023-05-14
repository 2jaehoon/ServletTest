package day0427;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ForwardServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 System.out.println("request" + request);
		 System.out.println("response" + response);
		
		//���������� ó���� ���
		String[] names = {"������","�����","��Թ�","��ΰ�","����ȣ","Ȳ�濬" };	
		
		//ȭ���� ����� ��Ʊ� ������ JSP�� �̵��Ѵ�.
		//1. �̵��� ������ ����
		RequestDispatcher rd = request.getRequestDispatcher("day0427/forward_view.jsp");
		//2. �̵��� ���������� ������ ���� ����( scope ��ü ��� )
		request.setAttribute("data", names);
		//3. �̵�
		rd.forward(request, response);
		
	}//doGet

}//class
